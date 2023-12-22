import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
        }
        int[]gc=new int[n];
        for(int i=0;i<n;i++){
          int next;
          if(i==0)next=a[1];
          else next=a[0];
          for(int j=0;j<n;j++){
              if(j!=i){
                gc[i]=gcd(next,a[j]);
                next=gc[i];
            }
          }
        }
        int max=gc[0];
        for(int i=1;i<gc.length;i++){
          int v=gc[i];
          if(v>max){
            max=v;
          }
        }
        System.out.println(max);
    }
    public static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}
