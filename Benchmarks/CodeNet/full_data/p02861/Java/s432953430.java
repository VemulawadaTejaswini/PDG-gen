import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int[] x=new int[n];
      	int[] y=new int[n];
      	for (int i=0;i<n;i++){
        	x[i]=sc.nextInt();
          	y[i]=sc.nextInt();
        }

      	double o=0;
      	for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
            	o+=Math.sqrt(Math.pow(x[i]-x[j],2)+Math.pow(y[i]-y[j],2));
          }
        }
      	o*=2;
      	o/=n;
      	System.out.println(o);
    }
}