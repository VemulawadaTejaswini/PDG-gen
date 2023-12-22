import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
      	Scanner scanInputs =  new Scanner(System.in);
        
        while(scanInputs.hasNext()) {
        	Integer baseInt = Integer.parseInt(scanInputs.next());
            Integer happyLevel = 0;
              if(baseInt>=500) {
                happyLevel += 1000 * (baseInt/500)
            	baseInt = baseInt % 500;
              }
              if(baseInt>=5) {
                happyLevel += 5 * (baseInt/5)
              }
          	System.out.println(happyLevel.toString());
            }
        }
    }
}