import java.util.Scanner;
import java.util.Arrays;

public class Main{
  static int judge(int a, int b, int c){
    if(a>b && b>c){
      return 1;
    }else if(a<b && b<c){
      return 1;
    }else{
      return 0;
    }
  }



  public  static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int[] array = new int[n];

    for(int i=0; i<n; i++){
      array[i] = sc.nextInt();
    }
    for(int j=1; j<n-1; j++){
      count += judge(array[j-1],array[j],array[j+1]);
    }

    System.out.println(count);
  }
}