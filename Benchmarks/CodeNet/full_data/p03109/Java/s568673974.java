import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);	      
	      	String sdate = sc.next();

	      	TemporalAccessor sparsed = DateTimeFormatter.ISO_LOCAL_DATE.parse(sdate);
	      	LocalDate formatDate = LocalDate.from(sparsed);
	             TemporalAccessor parsed = DateTimeFormatter.ISO_LOCAL_DATE.parse("2019/04/30");
	             LocalDate heiseiDate = LocalDate.from(parsed);

	      	 
	      	if(formatDate.isBefore(heiseiDate)){
	        	System.out.println("Heisei");
	        }else{
	        	System.out.println("TBD");
	        } 
	    }
}