import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long A = sc.nextLong();
	long B = sc.nextLong();
	long min = A;
	if(min > B) min = B;
	for(long i=min;i<=A*B;i++){
	    if(i%A==0 && i%B==0){
		System.out.print(i);
		break;
	    }
	} 
    }
}