
import java.util.Scanner;

class Main1 {
	public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    String s = scan.next();
    String t = scan.next();
    StringBuilder sb =new StringBuilder();

    for(int i=0 ; i < n ; i++) {
    sb.append(s.charAt(i));
    sb.append(t.charAt(i));
    }
    System.out.println(sb.toString());
	}
}