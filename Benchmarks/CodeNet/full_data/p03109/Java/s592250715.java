import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class  Main  {
    public static void main(String[] args) {
        Date formatDate;
        Date heiseiDate;
        
    	Scanner sc = new Scanner(System.in);
      
      	String sdate = sc.next();
      	
      	
      	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
 
      	 try {
             formatDate = sdf.parse(sdate);
             heiseiDate = sdf.parse("2019/04/30");
           }catch (ParseException e) {
                 e.printStackTrace();
           }
      	 
      	if(formatDate.before(heiseiDate)){
        	System.out.println("Heisei");
        }else{
        	System.out.println("TBD");
        } 
    }
};
