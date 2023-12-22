import java.util.*;
import java.time.*;
import java.time.format.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String str = sc.next();
      DateTimeFormatter f = 
        DateTimeFormatter.ofPattern("yyyy/MM/dd");
      LocalDate d =
        LocalDate.parse(str,f);
      LocalDate reiwa =
        LocalDate.parse("2019/04/30",f);
      if(d.isAfter(reiwa))
        System.out.println("TBD");
      else System.out.println("Heisei");
    }
}
