import java.util.*;
public class Main {
	public static void main(String[] args){
		// get numbers
		Scanner sc = new Scanner(System.in);     
        String str = sc.next();

        // output
        System.out.println(str.substring(0, 5)+ " " + str.substring(6, 13)+ " " +str.substring(14));
        sc.close();
	}
}