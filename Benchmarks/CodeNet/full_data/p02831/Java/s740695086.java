	import java.util.Scanner;
	
	public class Main {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	
			int a = sc.nextInt();
			int b = sc.nextInt();
	
			boolean flg=true;
			int count=1;
	
	
			while(flg==true) {
				if(b>a) {
					if(b*count % a == 0) {
						break;
					}else {
						count++;
					}
				}else {
					if(a*count % b == 0) {
						break;
					}else {
						count++;
					}
				}
	
			}
	
			System.out.println(b*count);
	
		}
	}
	
