import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n = as.nextInt();
		for(int i=(int)Math.sqrt(n)/2;i<=n;i++){
			if(n<=(i*(i+1))/2){
				System.out.println(i);
				break;
			}
		}
	}
}