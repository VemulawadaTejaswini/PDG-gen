import java.util.*;
public class Main {
	public static void main(String[] args){
    	int x=0;
        int y;
    	Scanner sc = new Scanner(System.in);
    	String a = sc.next();
        String data[] = a.split("");
	    System.out.println(data[0]+(a.length()-2)+data[a.length()-1]);
    }
}