import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int N = stdIn.nextInt();
	int o;
	if(N%2==0){
	    o = N/2;
	}else{
	    o = N/2+1;
	}
	double ans = (double)o/(double)N;
	System.out.println(ans);
    }
}
