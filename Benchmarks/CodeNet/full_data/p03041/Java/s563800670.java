import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
	int K = stdIn.nextInt();
	String S = stdIn.next();
	char n=S.charAt(K);
	if(n=='A'){
	    n=Character.toLowerCase('a');
	}
	if(n=='B'){
	    n=Character.toLowerCase('b');
	}
	if(n=='C'){
	    n=Character.toLowerCase('c');
	}
	for(int i=0;i<K;i++){
	    System.out.print(S.charAt(i));
	}
	System.out.print(n);
	for(int j=K+1;j<N;j++){
	    System.out.print(S.charAt(j));
	}
	System.out.println();
    }
}
