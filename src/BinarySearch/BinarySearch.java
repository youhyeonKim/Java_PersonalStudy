package BinarySearch;

import java.util.Scanner;

public class BinarySearch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("요소 개수: ");
    int n = sc.nextInt();
    int[] num = new int[n];
    int key = 0;

    System.out.println("오름차순으로 입력하세요");
    System.out.print("x[0]: ");
    num[0] = sc.nextInt();
    for(int i=1; i<n; i++){
      do{
        System.out.print("x["+i+"]:");
        num[i] = sc.nextInt();
      }while(num[i]<num[i-1]);
    }
    System.out.print("검색할 값: ");
    key = sc.nextInt();
    int idx = binarySearch(num, n, key);
    System.out.println(idx);
    if (idx != -1) {
      System.out.println("그 값은 x[" + idx + "]" + "에 있습니다.");
    } else {
      System.out.println("값이 존재하지 않습니다.");
    }
  }
    static int binarySearch(int[] num, int n, int key){
        int pl = 0;
        int pr = n-1;
        int pc = (pl+pr)/2;
        boolean flag = false;
        while(pr>=pl){
          if(num[pc] == key){
            flag = true;
            break;
          }
          else if(num[pc]>key){
            pr = pc-1;
          }
          else{
            pl = pc+1;
          }
          pc = (pl+pr)/2;
        }
        if(flag) return pc;
        else return -1;
    }
}
