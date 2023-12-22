import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter out = new PrintWriter(System.out);


        try {


    		String str = br.readLine();
    		String [] strArr = str.split(" ");

    		int intN = Integer.parseInt(strArr[0]);
    		int intK = Integer.parseInt(strArr[1]);


    		System.out.println(intN - intK + 1);

            out.flush();


        } catch (IOException e) {

        }


    }

}