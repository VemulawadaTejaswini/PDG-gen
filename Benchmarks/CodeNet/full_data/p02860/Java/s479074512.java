import java.util.*;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力の取得
      	int r = sc.nextInt();
      	String s = sc.next();
      	String[] p = s.split("");
      	int half = p.length / 2;
      	boolean flg = true;
      	if (p.length % 2 == 1) {
      	    System.out.println("No");
      	    return;
      	}
      	for(int i=0; i<half; i++) {
      	    if (!p[i].equals(p[half+i])) flg = false;
      	}

        if (flg) System.out.println("Yes");
      	else System.out.println("No");
    }
}
