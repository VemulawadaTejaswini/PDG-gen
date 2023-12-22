import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    int m=scanner.nextInt();
    int[] a= new int[n];
    int[] b= new int[m];
    int[] c= new int[m];
    long ans=0;

    for(int i=0;i<n;i++){
      a[i]=scanner.nextInt();
    }

    for(int i=0;i<m;i++){
      b[i]=scanner.nextInt();
      c[i]=scanner.nextInt();
    }

    Arrays.sort(a);

    for(int i=0;i<m;i++){
      for(int j=0;j<b[i];j++){
        if(a[j]<c[i]){
          a[j]=c[i];
        }
        else{
          break;
        }
      }
      Arrays.sort(a);
    }
    for(int i=0;i<n;i++){
      ans+=a[i];
    }
    System.out.println(ans);
  }
}
