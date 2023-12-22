import java.math.BigInteger;
import java.util.Scanner;
public class Main {   
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	while(in.hasNext())
    	{
    		int N = in.nextInt();
    		int[][] array = new int[N][2];
    		for( int i=0; i<N; i++)
    			for( int j=0; j<2; j++)
    				array[i][j] = in.nextInt();
    		BigInteger sum = new BigInteger("0");
    		BigInteger divide = new BigInteger("1000000007");
    		for( int i=0; i<N-1; i++){
    			for( int j=i+1;j<N;j++){
    				BigInteger temp = C(array[i][0]+array[i][1]+array[j][0]+array[j][1],
    						array[i][0]+array[j][0]);
    				sum = sum.add(temp);
    			}}
    		System.out.println(sum.mod(divide));
    	}
    	in.close();

    }  
    public static BigInteger C(int n,int k)
    {
    	BigInteger num = BigInteger.valueOf(1l);
        for (int i = n; i >= n - k + 1; i--)
        	num = num.multiply(BigInteger.valueOf(i));
        for (int i = 1; i <= k; i++)
        	num = num.divide(BigInteger.valueOf(i));
        return num;
    }
}