import java.util.Scanner;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = n; 
      int[] a = new int [n];
      for(int i=0;i<n-1;i++){
        a[i] = sc.nextInt();
      }
      int r;
      for(n=n;n<1;n--){
      for(int i=0;i<n-1;i++){
        if(a[i]-a[i+1]>0){
          r = a[i];
          a[i] = a[i+1];
          a[i+1] = r;}
        n = n - 1;
      }
      }
      System.out.println(a[m/2+1]-a[m/2]);
    }
}