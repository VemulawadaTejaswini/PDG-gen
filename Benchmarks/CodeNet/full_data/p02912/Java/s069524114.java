import java.util.*;

public class Main {
    public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);

    int n=sc.nextInt();
    int m=sc.nextInt();
    double a[]=new double[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextDouble();
    }
    Arrays.sort(a);
    long ans=0;

    for(int i=0;i<m;i++){
      if(n>=2){
        if(a[n-1]>=a[n-2]){
          a[n-1]=(double)a[n-1]/2;
        }else{
          Arrays.sort(a);
          a[n-1]=(double)a[n-1]/2;
        }
      }else{
        a[n-1]=(double)a[n-1]/2;
        Arrays.sort(a);
      }
    }

    for(int i=0;i<n;i++){
      ans+=(int)a[i];
    }

    System.out.println(ans);

	}
}
