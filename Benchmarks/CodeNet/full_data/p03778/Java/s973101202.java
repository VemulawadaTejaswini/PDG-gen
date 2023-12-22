import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int w,a,b,distance;
		Scanner sc = new Scanner(System.in);

		w = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a + w == b){
			distance = 0;
		}else if(a < b){
			distance = b - (a+w);
		}else if(a > b){
			distance = a - (b+w);
		}else{
			distance = 0;
		}
		System.out.println(distance);
	}
}
