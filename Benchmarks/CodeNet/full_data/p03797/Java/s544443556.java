import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int c = sc.nextInt();
		int scc = 0;
		for(;;){
			if(c<2)break;
			if(s<1&&c<2)break;
			if(s<1||c>3){
				s++;
				c -= 2;
			}
			s -= 1;
			c -= 2;
			scc++;
		}
                System.out.println(scc);
	}

}