

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner sc = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int[] beki= {1,6,9,36,81,216,729,1296,6561,7776,46656,59049};
        int i=11;
        int A=sc.nextInt();
        int cnt=0;
        while(A==0) {
        	if(A<beki[i]) {i--;}
        	else {
        		A-=beki[i];
        		cnt++;

        	}

        }
		out.print(cnt);
		sc.close();



	}

}
