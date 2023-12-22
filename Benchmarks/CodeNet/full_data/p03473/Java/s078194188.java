import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	int M = Integer.parseInt(s);
      	int x = 48 - M;
      	System.out.println(x);
      	sc.close();
    }
}