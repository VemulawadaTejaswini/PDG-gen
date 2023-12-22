import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;
        int check=0;
        int  N=sc.nextInt();
        int K[]=new int[N];
        int max=0;
        int min=999999999;
        for(int i=0;i<N;i++) {
        K[i]=sc.nextInt();
        if(K[i]>max) {max=K[i];}
        if(K[i]<min) {min=K[i];}
        }
        //System.out.println(min);
        //System.out.println(max);
       int sumend=999999999;
        for(int i=(min/2)-1;i<max*2;i++) {
        	 int sum=0;
        	for(int j=0;j<N;j++) {
        		sum+=Math.abs(K[j]-(i+j));

        	}
        	//System.out.println(i+":sum="+sum);
        	if(sum<sumend) {sumend=sum;}
        }
        System.out.println(sumend);
	}

}
