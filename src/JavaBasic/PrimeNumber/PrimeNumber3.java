package JavaBasic.PrimeNumber;

public class PrimeNumber3 {

  public static void main(String[] args) {
    int counter =0;
    int ptr = 0;
    int[] prime = new int[500];

    prime[ptr++] = 2;
    prime[ptr++] = 3;

    for(int i=5; i<=1000; i+=2){
      boolean flag = false;
      for(int j=1; prime[j]*prime[j] <=i; j++){
        counter+=2;
        if(i%prime[j]==0){
          flag = true;
          break;
        }
      }
      if(!flag){
        prime[ptr++] = i;
        counter++;
      }
    }
    System.out.println(counter);
  }

}
