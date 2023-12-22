import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int count = 0;
	for(int A=1;A<=N;A++){
	    for(int B=A;B<=N;B++){
		String a = Integer.toString(A);
		String b = Integer.toString(B);
		if(a.charAt(0) == b.charAt(b.length()-1) &&
		   a.charAt(a.length()-1) == b.charAt(0) ){
		    count++;
		    if(A!=B) count++;
		}
	    }
	}
	System.out.print(count);
    }
}
