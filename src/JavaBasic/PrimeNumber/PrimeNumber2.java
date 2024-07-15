package JavaBasic.PrimeNumber;

public class PrimeNumber2 {

  public static void main(String[] args) {
    int[] prime_numset = new int [500];
    int ptr = 1;
    prime_numset[0] = 2;
    for(int i=3; i<=1000; i+=2){
      int j;
      for(j = 0; j<ptr; j++){
        if(i%prime_numset[j] == 0)
          break;
      }
      if(j == ptr){
        prime_numset[ptr] = i;
        ptr++;
      }
    }
    System.out.println(ptr);
  }

}
