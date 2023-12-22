import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        
		System.out.println(((a*100+b*10+c)%4)>0?"N0":"YES");
	}
}