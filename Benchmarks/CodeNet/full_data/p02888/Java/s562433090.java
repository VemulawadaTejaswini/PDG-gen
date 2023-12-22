import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] nums = new int[N];
    int result=0;
    for (int i = 0; i < N; i++) {
      nums[i] = sc.nextInt();
    }

    Arrays.sort(nums);
    for (int i = 0; i < N; i++) {
      for (int j = i+1; j < N; j++) {
        int a = nums[i];
        int b = nums[j];
        for (int k = j+1; k < N; k++) {
          int c = nums[k];
          if(c>=a+b) break;
          if( (a<b+c) && (b<a+c) && (c<b+a) ){
            result++;
          }
        }
      }
    }


    System.out.println(result);
  }

}
