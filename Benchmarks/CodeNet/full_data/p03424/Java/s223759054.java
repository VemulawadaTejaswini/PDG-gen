import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
                String Str = sc.nextLine();
                String s;
                int i = Str.indexOf("Y");
                    if(i==-1)
                      s = "Three";
                    else
                      s = "Four";

		System.out.println(s);
	}
}