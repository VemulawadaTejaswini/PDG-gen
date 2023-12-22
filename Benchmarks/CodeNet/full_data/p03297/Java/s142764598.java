import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long A=sc.nextLong();
		long B=sc.nextLong();
		long C=sc.nextLong();
		long D=sc.nextLong();
		
		if(B>D){
			System.out.println("no0");
			return;
		}
		
		long BB=A%B;
		
		HashSet<Long> hash = new HashSet<>();
		while(true){
			BB+=D;
			BB%=B;
			if(BB>C){
				System.out.println("no1");
				return;
			}else if(hash.contains(BB)){
				System.out.println("yes1");
				return;
			}else{				
				hash.add(BB);
			}
		}
	}
}