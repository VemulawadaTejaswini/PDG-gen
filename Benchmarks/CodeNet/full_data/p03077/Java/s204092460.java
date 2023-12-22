import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String strN[] = new String[6];

        long intNin = 0;
        long intTime[] = new long[5];

        PrintWriter out = new PrintWriter(System.out);
        try {

        	for (int i=0 ; i < 6 ; i++) {
        		strN[i] = br.readLine();
        	}
        	intNin = Long.parseLong(strN[0]);

        	long intMin = Long.MAX_VALUE;
        	for (int i=1 ; i < 5 ; i++) {
        		intTime[i] =  Long.parseLong(strN[i]);

        		if (intMin > intTime[i]) intMin = intTime[i];
        	}

        	long intResult = intNin / intMin + 4 + (intNin % intMin == 0 ? 0 : 1);

    		System.out.println(intResult);


            out.flush();


        } catch (IOException e) {

        }


    }

}