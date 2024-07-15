package JavaBasic.PrimeNumber;

public class PrimeNumber1 {

  public static void main(String[] args) {
    int count = 0;
    int check = 0;
    int prim_num = 0;
    for(int i=2; i<=1000; i++){
      int j;
      for(j=2; j<i; j++){
        count++;
        if(i%j==0){
          break;
        }
      }
      if (i == j) {
        System.out.println(i);
        prim_num++;
      }
    }
    System.out.println("나눗셈을 실행한 횟수: "+count);
    System.out.println(prim_num);
  }

}
