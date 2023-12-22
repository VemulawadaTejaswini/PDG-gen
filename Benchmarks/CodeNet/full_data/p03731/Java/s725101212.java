import java.util.Scanner;

public class Main{
	pulic static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int n = Integer.ParseInt(scan.read());
		int t = Integer.ParseInt(scan.read());
		
		int s = Integer.ParseInt(scan.next());;
		int sum = 0;

		for(int i = 1 ; i < n ; < i++){
			
			int time = Integer.ParseInt(scan.next());
			if(time - s >= t){
				sum += t;
			} else {
				sum += time - s;
			}
			s = time;
		}
		System.out.println(sum);
	}
}