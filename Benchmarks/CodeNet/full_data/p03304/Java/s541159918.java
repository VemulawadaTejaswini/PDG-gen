import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;
        long A = sc.nextInt();
        long B = sc.nextInt();
        int C=sc.nextInt();
        long tmp=0;
        long check=0;
        for(int i=1;i<=A;i++) {
        	if(A-i>=C||i-1>=C) {check++;}
        }

        for (int i=0;i<B-1;i++) {
        	tmp+=Math.pow(B, i);
        }
        long tmp2=(long)Math.pow(A, B);
        //System.out.println(check);

        System.out.println((double)tmp*check/(double)tmp2);
	}

}