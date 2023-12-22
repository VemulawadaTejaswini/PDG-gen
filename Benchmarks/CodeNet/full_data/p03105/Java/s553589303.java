import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int count=0;
		if(b>=a*c){
			count=c;
		}else{
			for(int i=1;i<c;i++){
				if(b<i*a){
					break;
				}
				count++;
			}
		}
		System.out.println(count);
	}
}