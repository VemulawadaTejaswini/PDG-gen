
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		int n = Integer.parseInt(s);
		int count = 0;
		int mae = 0;
		boolean b = true;
		boolean up = false;
		for(int i = 0;i < n;i++){
			int m = Integer.parseInt(scan.next());
			
			if(i == 0){
				mae = m;
				continue;
			}
			if(b){
				up = m > mae;
				b = false;
				continue;
			}
			if(up){
				if(m < mae){
					b = true;
					count++;
				}
				mae = m;
				continue;
			}else{
				if(m > mae){
					b = true;
					count++;
				}
				mae = m;
				continue;
			}
			
		}
		System.out.println(++count);
	}
	
}
