import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] arr =  new int[] {
      scan.nextInt(),
      scan.nextInt(),
      scan.nextInt()
    };

    int maxIndex = -1;
    int maxKisu = -1;
    int kisuCount = 0;
    for(int i = 0; i < 3; i++) {
      if(arr[i]%2==1) {
        kisuCount++;
        if(arr[i] > maxKisu) {
          maxKisu = arr[i];
          maxIndex = i;
        }
      }
    }

    if(kisuCount < 3) {
      System.out.println(0);
    }
    else{
      long result = 1L;
      for(int i = 0; i < 3; i++) {
        if(i!=maxIndex) {
          result *= arr[i];
        }
      }
      System.out.println(result);
    }
  }
}
