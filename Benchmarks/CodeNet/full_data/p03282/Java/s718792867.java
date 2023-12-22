import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String S = scan.next();
			
			long K = scan.nextLong();
			
			int one_count = 0;
			boolean one = false;
			
			for(int i = 0;i<S.length();i++) {
				if(!S.substring(i,i+1).equals("1")) {
					break;}
				one_count++;
			}
			
			
			//System.out.println(one_count);
			
			
			if(one_count==0) {//一文字めが１ではなかった
				System.out.println(S.substring(0, 1));
			}else {//一文字目が１でone_countの値が一が続く個数
				if(one_count<K) {
					System.out.println(S.substring(one_count, one_count+1));
				}else{
					 System.out.println("1");
				}
			}
			
			
			/*if(S.substring(0, 1).equals("1")) {
				if(K==1) System.out.println("1");
				else System.out.println(S.substring(1, 2));
			}else{
				System.out.println(S.substring(0, 1));
			}*/
			
			
			
		}
	}
}
