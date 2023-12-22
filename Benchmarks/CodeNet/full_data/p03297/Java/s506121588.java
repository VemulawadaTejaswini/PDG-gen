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
			if(D%B==0&&BB<=C){
				System.out.println("Yes");
				continue queri;
			}
			HashSet<Long> hash = new HashSet<>();
			while(true){
				while(BB<=C){
					BB+=D%B;
				}
				if(BB<B){
					System.out.println("No");
					continue queri;
				}
				if(hash.contains(BB)){
					System.out.println("Yes");
					continue queri;
				}
				hash.add(BB);
				BB%=B;
			}
		}
	}
}
