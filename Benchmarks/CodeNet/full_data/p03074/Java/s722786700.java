import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String str0 = null;
        String str1 = null;


        PrintWriter out = new PrintWriter(System.out);
        try {
            str0 = br.readLine();
            str1 = br.readLine();

            String str00[] = str0.split(" ", 0);

            int intLen = Integer.parseInt(str00[0]);
            int intCmd = Integer.parseInt(str00[1]);

            int int0Cnt[] = new int[intLen];
            int int1Cnt[] = new int[intLen];

            int intSet = 0;

            int i=0;
        	for ( ; i < intLen ; i++) {

        		int i1 = i;
            	for ( ; i1 < intLen ; i1++) {
            		if (str1.charAt(i1)=='1') {
            			int1Cnt[intSet]++;
            		}else {
            			break;
            		}
            	}
            	int i0 = i1;
            	for ( ; i0 < intLen ; i0++) {
            		if (str1.charAt(i0)=='0') {
            			int0Cnt[intSet]++;
            		}else {
            			break;
            		}
            	}
            	i = --i0;
            	intSet++;
            }

        	int intMax = 0;

        	for (int j=0 ; j<intSet ; j++) {
        		int intCounter = 0;
            	for (int k=j ; k<intSet && k<j+intCmd+1  ; k++) {
            		intCounter += int1Cnt[k];

            		if (k != j+intCmd) {
            			intCounter += int0Cnt[k];
            		}
            	}

            	if (intMax <= intCounter) {
            		intMax = intCounter;
            	}
        	}



            System.out.println(intMax);


        } catch (IOException e) {

        }


    }
  
  
}