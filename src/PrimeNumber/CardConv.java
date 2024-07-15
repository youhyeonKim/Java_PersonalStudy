package PrimeNumber;

import java.util.Scanner;

public class CardConv {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    int numary;
    int numary_digit;
    int retry = 1;
    char[] ch = new char[32];

    do{
      do {
        System.out.println("10진수 기수 변환합니다.");
        System.out.println("변환하는 음이 아닌 정수: ");
        num = sc.nextInt();
      }while(num<0);

      do{
        System.out.print("어떤 진수로 변환할까요? (2~36):");
        numary = sc.nextInt();
      }while(numary<2||numary>36);

      numary_digit = cardConv(num, numary, ch);
      System.out.print(numary+"진수로");
      for(int i=0; i<numary_digit; i++){
        System.out.print(ch[i]);
      }
      System.out.println("입니다.");

      System.out.print("다시 시작할까요? (1. 예/ 0. 아니요");
      retry = sc.nextInt();
    }while(retry==1);
  }

  public static int cardConv(int num, int numary, char[] ch){
    int count = 0;
    String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println(numary+"|\t\t"+num);
    System.out.println("\t"+"+----");
    do{
      if(num/numary>0){
        ch[count++] = str.charAt(num%numary);
        num = num/numary;
        System.out.println(numary+"|\t\t"+num+"..."+ch[count-1]);
        System.out.println("\t"+"+----");
      }else{
        ch[count++] = str.charAt(num%numary);
        num = num/numary;
        System.out.println("\t\t\t\t"+num+"..."+ch[count-1]);
      }
    }while(num>0);

    for(int i=0; i<count/2; i++){
      char temp = ch[i];
      ch[i] = ch[count-1-i];
      ch[count-1-i] = temp;
    }
    return count;
  }

}
