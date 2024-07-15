package LinearSearch;

import java.util.Scanner;

public class SeqSearch_deepenig {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("요소의 개수: ");
    int n = sc.nextInt();
    int[] num = new int[n];
    for(int i=0; i<n; i++){
      System.out.print("x["+i+"]: ");
      num[i] = sc.nextInt();
    }
    System.out.print("검색할 값: ");
    int key = sc.nextInt();
    print_seqSearch_process(num, n, key);
  }

  static void print_seqSearch_process(int[] num, int n, int key){
    System.out.print("\t|");
    for (int i = 0; i < n; i++) {
      System.out.print("\t"+i);
    }
    System.out.println();
    System.out.println("--+"+"--".repeat(n));

    int i=0;
    while(i<n){
      System.out.println("\t|"+"\t".repeat(i+1)+"*");
      System.out.print(i+" |");
      for (int number : num) {
        System.out.print("\t"+number);
      }
      System.out.println();
      if(num[i] == key){
        System.out.println("그 값은 x["+i+"]에 있습니다.");
        break;
      }
      System.out.println("\t|");
      i++;
    }
    if (i == n) {
      System.out.println("값이 없습니다.");
    }


  }
}
