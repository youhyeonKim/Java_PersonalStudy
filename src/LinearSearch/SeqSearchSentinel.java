package LinearSearch;
//선형검색
import java.util.Scanner;

public class SeqSearchSentinel {

  public static void main(String[] args) {
    //element n개인 num배열
    Scanner sc = new Scanner(System.in);
    System.out.print("요소의 개수: ");
    int n = sc.nextInt();
    int[] num = new int[n+1];
    for(int i=0; i<n; i++){
      System.out.print("x["+i+"]: ");
      num[i] = sc.nextInt();
    }
    System.out.println("검색할 값: ");
    num[n] = sc.nextInt();
    System.out.println("그 값은 x["+seqSearch(num)+"]에 있습니다.");
  }

  static int seqSearch(int[] num){
    int i;
    for(i=0; i<num.length; i++){
      if(num[i] == num[num.length-1]){
        break;
      }
    }
    return i == num.length? -1:i;
  }

}
