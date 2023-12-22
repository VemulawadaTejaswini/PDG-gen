import java.util.Scanner;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    	int line = sc.nextInt();
    	int line2 = sc.nextInt();
      System.out.print(lcm(line,line2));
    }

	//最小公倍数lcm
	static int lcm (int a, int b) {
		int temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (int)(c/b);
	}
}