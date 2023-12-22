import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String strN[] = new String[5];

        PrintWriter out = new PrintWriter(System.out);
        try {

        	for (int i=0 ; i < 5 ; i++) {
        		strN[i] = br.readLine();
        	}

        	int intN[] = new int[5];
        	int intMod[] = new int[5];

        	int intSum=0;
        	for (int i=0 ; i < 5 ; i++) {
        		intN[i] = Integer.parseInt(strN[i]);
        		intMod[i] = intN[i] % 10;
        		intSum += intN[i] - intMod[i];
        		if (intMod[i] != 0) intSum +=10;

        	}

        	int intMin = intMod[0];
        	if (intMin == 0)	intMin = 9;

        	int j= 0;
        	for (int i=1 ; i<5 ; i++) {
        		if (intMin > intMod[i] && intMod[i] !=0) {
        			intMin = intMod[i];
        			j = i;
        		}
        	}

        	if (intMod[j] != 0) intSum -= (10 - intMod[j]);

    		System.out.println(intSum);


            out.flush();


        } catch (IOException e) {

        }


    }

}