import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		boolean jdg =true;
		int a = c.length()-1;
		if(c.length()%2==0)a-=1;
		for(int i =  a;i >=2;i-=2) {
			for(int k = 0;k < i/2;k++) {
				if(c.charAt(k) != c.charAt(k+(i/2))) {
					jdg = false;
					break;
				}
			}
			if(jdg == true) {
				System.out.println(i);
				break;
			}
			jdg = true;
		}
	}

}
