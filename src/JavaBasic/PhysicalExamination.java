package JavaBasic;

import java.util.Scanner;

public class PhysicalExamination {
  static final int VMAX  = 21;

  static class PhysData {

    String name;
    int height;
    double vision;

    PhysData(String name, int height, double vision) {
      this.name = name;
      this.height = height;
      this.vision = vision;
    }

  }
      static double avgHeight(PhysData[] dat){
        double sum = 0;
        for(PhysData p:dat)
          sum += p.height;
        return sum/dat.length;
      }

      static void distVision(PhysData[] dat, int[] dist){
        int i=0;
        dist[i] = 0;
        if(dat[i].vision >= 0.0 && dat[i].vision<= VMAX/10)
          dist[(int)(dat[i].vision*10)]++;
      }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PhysData[] x = {
        new PhysData("강민하", 162, 0.3),
        new PhysData("김찬우", 173, 0.7),
        new PhysData("박준서", 175, 2.0),
        new PhysData("유서범", 171, 1.5),
        new PhysData("이수연", 168, 0.4),
        new PhysData("장경오", 174, 1.2),
        new PhysData("황지안", 169, 0.8),
    };
    int[] dist = new int[VMAX];

    System.out.println("<<신체검사 리스트>>");
    System.out.println("이름    키     시력");
    System.out.println("-----------------");
    for(int i=0; i<x.length; i++){
      System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
    }
    System.out.printf("평균키: %5.1fcm\n", avgHeight(x));

    distVision(x, dist);
  }
  }


