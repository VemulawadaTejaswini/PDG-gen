import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arrS = sc.next().toCharArray();
		char[] arrT = sc.next().toCharArray();
		for (int i = 0; i <= n; i++) {
		    boolean flag = true;
		    for (int j = 0; i + j < n; j++) {
		        if (arrS[i + j] != arrT[j]) {
		            flag = false;
		            break;
		        }
		    }
		    if (flag) {
		        System.out.println(i + n);
		        return;
		    }
		}
	}

}
