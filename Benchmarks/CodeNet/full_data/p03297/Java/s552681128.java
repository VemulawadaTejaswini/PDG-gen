import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		queri:for(int i=0;i<T;i++){
			long A=sc.nextLong();
			long B=sc.nextLong();
			long C=sc.nextLong();
			long D=sc.nextLong();
			
			if(A<B||B>D){
				System.out.println("No");
				continue queri;
			}
			
			long BB=A%B;
			
			HashSet<Long> hash = new HashSet<>();
			while(true){
				BB+=D;
				BB%=B;
				if(BB>C){
					System.out.println("No");
					continue queri;
				}else if(hash.contains(BB)){
					System.out.println("Yes");
					continue queri;
				}else{				
					hash.add(BB);
				}
			}
		}
	}
}
