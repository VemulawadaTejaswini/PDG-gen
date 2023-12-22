import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
      	String sdate = sc.next();
      
      	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
 
        Date formatDate = sdf.parse(sdate);
      	Date heiseiDate = new SimpleDateFormat("yyyy/MM/dd").format(2019/04/30);
 
      	if(formatDate.before(heiseiDate)){
        	System.out.println("Heisei");
        }else{
        	System.out.println("TBD");
        } 
    }
};