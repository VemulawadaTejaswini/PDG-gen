import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
		 BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
		      String line;
		      int[] number = new int[3];
		      int i = 0;
		      while (i<3) { 
		    	  line = stdReader.readLine();
		    	  number[i] = Integer.parseInt(line);
		    	  i++;
		      }
		      int result = number[0]*100 + number[1]*10 + number[2];
		     if((result % 4) == 0){
					System.out.print("Yes");
			}
			else{
					System.out.print("NO");
				}
		      stdReader.close();
		    } catch (Exception e) {
		      e.getStackTrace();
		      /*返却値は0固定*/
		      System.exit(0); 
		    }
	}
}