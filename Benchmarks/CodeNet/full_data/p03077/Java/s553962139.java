import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String strN[] = new String[6];

        long lngNin = 0;
        long lngTime[] = new long[5];

        PrintWriter out = new PrintWriter(System.out);
        try {

        	for (int i=0 ; i < 6 ; i++) {
        		strN[i] = br.readLine();
        	}
        	lngNin = Long.parseLong(strN[0]);

        	int idx = 0;

        	for (int i=0 ; i < 5 ; i++) {
        		lngTime[i] =  Long.parseLong(strN[i+1]);

        		if (lngTime[idx] > lngTime[i]) idx = i;
        	}

        	long intResult = lngNin / lngTime[idx]  + 4 + (lngNin % lngTime[idx] == 0 ? 0 : 1);

//        	double dtmp =  Math.ceil((double)intNin / intTime[intMin]);
//        	long intResult = (long)dtmp + 4;

    		System.out.println(intResult);

            out.flush();


        } catch (IOException e) {

        }


    }

}