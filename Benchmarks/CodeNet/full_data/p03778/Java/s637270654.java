import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = 0;
		
		for (int i=1;i>0;i++) {
			if (Math.abs(a-b) <= w){
				System.out.println(min);
				break;
			}else{
				min+=i;
				w++;
			}
		}
	}
}