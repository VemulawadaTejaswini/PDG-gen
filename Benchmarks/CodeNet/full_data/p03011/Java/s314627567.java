import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = a+b;
      	if (b+c<=d){
          d = b+c;
        }
      	if (c+a<=d){
          d = c+a;
        }
		System.out.println(d);
	}
}