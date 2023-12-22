import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                String datestr = (StringBuffer)sc.next();
                datestr.replace(1,4,"2018");
		System.out.println(datestr);
	}
}
