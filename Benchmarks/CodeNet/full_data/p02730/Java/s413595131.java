import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	int N = S.length();
	char[] ss = new char[N+2];
	for(int i=1;i<=N;i++) ss[i] = S.charAt(i-1);

	boolean result = true;
	for(int i=1; i<=(N-1)/4; i++){
	    int j=(N-1)/2;
	    if(ss[i]!=ss[j]){
		if(ss[i + (N+3)/2]!=ss[j + (N+3)/2]){
		    result = false;
		}
	    }
	    j--;
	}
	if(result) System.out.print("Yes");
	else System.out.print("No");
    }
}
