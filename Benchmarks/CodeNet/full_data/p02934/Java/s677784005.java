import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

	        InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader    br = new BufferedReader(isr);
		         String str = null;
		         int line []= new int [N];
		         double tos=0.0;

			     str = br.readLine();
				 String split[] = str.split(" ",0);
				 for(int i=0;i<N;i++) {
				 line[i]  =Integer.parseInt(split[i]);

				 tos+=(double)1/line[i];

				 }

		System.out.println(1/tos);



	}



}
