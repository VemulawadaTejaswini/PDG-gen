import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	int T = stdIn.nextInt();
	//double t=T+0.5;
	int s =T/A;
	System.out.println(s*B);
    }
}
