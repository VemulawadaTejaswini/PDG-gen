import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for(int i=0;i<n;i++){
      if(i%2==0){
        Arrays.fill(b,0);
        a[i]=sc.nextInt();
        for(int m=0;m<=i;m++){
          b[m]=a[i-m];
        }
      }else{
        Arrays.fill(a,0);
        b[i]=sc.nextInt();
        for(int m=0;m<=i;m++){
          a[m]=b[i-m];
        }
      }
    }
    if(n%2==0){
      for(int m=0;m<n;m++){
        System.out.print(a[m]);
      }
    }else{
      for(int m=0;m<n;m++){
        System.out.print(b[m]);
      }
    }
  }
}