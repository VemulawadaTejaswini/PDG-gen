import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k  =sc.nextInt(), s = sc.nextInt();
		
		int cnt = 0;
		for(int x=0;x<=k;x++){
			for(int y=0;y<=k;y++){
				if(x+y<=s && x+y+k>=s)
					cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
