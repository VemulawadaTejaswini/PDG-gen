
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int K = sc.nextInt();
		 Random random = new Random();

		if((1<=s.length() && s.length()<=100000) &&(1<=K && K<=1000000000) && (s.equals(s.toLowerCase()))){
			for(int i=1;i<K;i++){
				int randomValue = 1 + random.nextInt((s.length() - 1));
				s = s.substring(0,randomValue)+ Character.valueOf((char) (((int)s.charAt(randomValue)+1)%25 + 97)) +s.substring(randomValue+1);
			}
			System.out.println(s);
		}
	}
	

}
