import java.util.Scanner;
import java.util.Arrays;

public class Main
{

	public static void main(String[] args)
	{	Scanner s = new Scanner(System.in);
                int dd = s.nextInt();
                int n = s.nextInt();
                int m = s.nextInt();
                int[] a = new int[n];
                int[] b = new int[n];
                int[] c = new int[m];
                int[] d = new int[m];
                int i=0,sum=0,j=0,k=0,r=0;
                float sum1=0;
                for(i=0;i<n;i++){
                  a[i] = s.nextInt();
                  b[i] = s.nextInt();
                }
                for(i=0;i<m;i++){
                  c[i] = s.nextInt();
                  d[i] = s.nextInt();
                }
                for(i=0;i<m;i++){
                    for(j=0;j<n;j++){
                        if((c[i]<=a[j] && d[i]>=b[j]) || (c[i]<= b[j] && d[i]>= a[j])){
                          r++;
                        }
                    }
                    System.out.println(r);
                    r=0;
                }
	}
}