package JavaBasic.PrimeNumber;

public class PrimeNumber {

  public static void main(String[] args) {
    primeNumber1();
    primeNumber2();
    primeNumber3();

  }


  static void primeNumber1(){
    int count = 0; //나누는 횟수;
    int prime_n = 0;
    for(int i=2; i<=1000; i++){
      int j = 2;
      for(j=2; j<i; j++){
        count++;
        if(i%j==0){
          break;
        }
      }
      if(j == i)
        prime_n++;
    }
    System.out.println("1. 소수개수: "+prime_n+" 1. 나누는 횟수: "+count);
  }

  static void primeNumber2(){
    int[] prime_n = new int[500];
    int count = 0;
    prime_n[0] = 2;
    int pointer = 1;

    for(int i=3; i<=1000; i+=2){
      int j;
      for(j=0; j<pointer; j++){
        count++;
        if(i%prime_n[j]==0)
          break;
      }
      if(j == pointer){
        prime_n[pointer++] = i;
      }
    }
    System.out.println("2. 소수개수: "+pointer+" 2. 나누는 횟수: "+count);
  }

  static void primeNumber3(){
    int[] prime_n = new int[500];
    int count =0;
    int pointer = 0;
    prime_n[pointer++] = 2;

    for(int i=3; i<=1000; i+=2){
      boolean flag = false;
      for(int j=0; prime_n[j]*prime_n[j]<=i; j++){
        count+=2;
        if(i%prime_n[j]==0){
          flag = true;
          break;
        }
      }
      if(!flag){
        prime_n[pointer++] = i;
        count++;
      }

    }
    System.out.println("3. 소수개수: "+pointer+" 3. 나누는 횟수: "+count);

  }
}
