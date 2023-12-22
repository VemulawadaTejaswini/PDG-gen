import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
	private final static Pattern regex_pattern = Pattern.compile("(\\d){4} \\/ (\\d){2} \\/ (\\d){2}", Pattern.COMMENTS);
	private final static Matcher regex_match = Main.regex_pattern.matcher("");	
	
	private final static SimpleDateFormat SF = new SimpleDateFormat("yyyy/MM/dd");
	public static String S;
	
	public static void main(String[] args) {		
		Date date2c = null;

		try {
			date2c = SF.parse("2019/04/30");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
    	Scanner sc = new Scanner(System.in);
    	    	
    	S = sc.next().trim();
   
    	try {
        	if(!validateInput(S)) { throw new Exception(); }
        		

        	if(SF.parse(S).after(date2c)) {
        		System.out.println("TBD");
        	} else {
        		System.out.println("Heisei");
        	}
        	
        	sc.close();
    	} catch (Exception e) {
    		System.out.println("Invalid Input!");
    	}
    }
	
	private static boolean validateInput(String in) {
		regex_match.reset(in);
		
		if(regex_match.matches()) {
			return true;
		}
		
		return false;
	}
}
