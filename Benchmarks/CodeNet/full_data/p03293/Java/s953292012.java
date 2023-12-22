import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    char[]ss = S.toCharArray();
    char[]t = T.toCharArray();

    int cou = 0;
    for(int i=0; i<S.length(); i++){
    	for(int j=0; j<T.length(); j++) {
        if(ss[i] == t[j]) {
        	if((S.substring(i,S.length()) + S.substring(0,i)) .equals (T.substring(j,T.length()) + T.substring(0,j))) {
        		cou++;
        	}
        }
        }
    }
   if(cou > 0) {
		System.out.println("Yes");
   }else {
	   	System.out.println("No");
   }
}
}
