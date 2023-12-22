import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter out = new PrintWriter(System.out);


		int cnt = 0;
        try {


    		String str = br.readLine();
    		String [] strArr = str.split(" ");

    		int intR = Integer.parseInt(strArr[0]);
    		int intG = Integer.parseInt(strArr[1]);
    		int intB = Integer.parseInt(strArr[2]);
    		int intN = Integer.parseInt(strArr[3]);
    		for (int r = 0 ; true ; r++) {
        		for (int g = 0 ; true ; g++) {
            		for (int b = 0 ; true ; b++) {
            			if (intR * r + intG * g + intB * b == intN) cnt ++;
            			if (intR * r + intG * g + intB * b >= intN) break;
            		}
        			if (intR * r + intG * g  >= intN) break;
        		}
    			if (intR * r  >= intN) break;
    		}

//        		System.out.println(intR + "/" + intG + "/" + intB + "/" + intN);
       		System.out.println(cnt);

            out.flush();


        } catch (IOException e) {

        }


    }

}