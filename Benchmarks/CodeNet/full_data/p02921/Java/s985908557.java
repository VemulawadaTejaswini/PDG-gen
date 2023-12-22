import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        String S = stdIn.next();
	String T = stdIn.next();
	int count=0;
	for(int i=0;i<S.length();i++){
	    char s=S.charAt(i);
	    char t=T.charAt(i);
	    if(s==t){
		count++;
	    }
	}
	System.out.println(count);
    }
}
	
