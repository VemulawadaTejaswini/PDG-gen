import java.util.*;
import java.io.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream pr = System.out;
        PrintWriter out = new PrintWriter(pr);
        int n = sc.nextInt();
        double[] array = new double[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextDouble();
        }
        double d=0.0;
        if(n==1){
            d = array[0];
        }else if(n==2){
            d = (array[0]+array[1])/2;
        }else{
            Arrays.sort(array);
            d = (array[0]+array[1])/2;
            for(int i=2;i<n;i++){
                d=(d+array[i])/2;
            }
        }
        out.print(d);
        out.close();
    }
    public static long gcd(long a,long b){
        if(a==0){
            return b;
        }else{
            return gcd(b%a,a);
        }
    }
}