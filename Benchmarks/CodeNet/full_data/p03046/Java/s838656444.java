import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int m = seer.nextInt();
		int k = seer.nextInt();
		if(k == 0){
			int p = (int)Math.pow(2, m);
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < p; i++){
				sb.append(i+" "+i+" ");
			}
			System.out.println(sb.toString().trim());
		}
		else{
			System.out.println(-1);
		}
	}

}
