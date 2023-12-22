import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	int n = scan.nextInt();
	int c1 = 0;  // B~A
	int c2 = 0;  // B~X
	int c3 = 0;  // X~A
	String[] s = new String[n];
	for(int i = 0; i < n; i++){
	    s[i] = scan.next();
	    if(s[i].charAt(0) == 'B' &&
	       s[i].charAt(s[i].length()-1) == 'A'){
		c1++;
	    }else if(s[i].charAt(0) == 'B'){
		c2++;
	    }else if(s[i].charAt(s[i].length()-1) == 'A'){
		c3++;
	    }
	}

	int AB = 0;
	for(int i = 0; i < n; i++){
	    AB += countAB(s[i]);
	}

	/* B~Aが0個だった場合 */
	if(c1 == 0){
	    AB += Math.min(c2,c3);
	}
	/* B~Aが1個以上の場合 */
	else{
	    /* X~A == B~Xの場合 */
	    if(c2 == 0 && c3 == 0){
		AB += (c1-1);
	    }else{
		AB += c1+Math.min(c2,c3);
	    }
	}

	System.out.println(AB);
    }

    /* 文字列中のABの数を数える */
    static int countAB(String s){
	int count = 0;
	for(int i = 0; i < s.length(); i++){
	    if(s.charAt(i) == 'A' && i != s.length()-1){
		if(s.charAt(i+1) == 'B'){
		    count++;
		}
	    }
	}

	return count;
    }
}
