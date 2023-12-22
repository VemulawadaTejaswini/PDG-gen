import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
 	  	Scanner scanInputs =  new Scanner(System.in);

      while(scanInputs.hasNext()) {
        	if(String.valueOf(scanInputs.next()).length == 6) {
              String strInput = String.valueOf(scanInputs.next()).substring(2);
              String firstStr = strInput.substring(0, 1);
              String nextStr = strInput.substring(1, 1);
              if(firstStr.equals(nextStr)) {
                firstStr = strInput.substring(2, 1);
                nextStr = strInput.substring(3, 1);
	              if(firstStr.equals(nextStr)) {
                  	System.out.println("Yes");
                  } else {
                  	System.out.println("No");
                  }
              } else {
                  	System.out.println("No");
              }
            }
		}
    }
}