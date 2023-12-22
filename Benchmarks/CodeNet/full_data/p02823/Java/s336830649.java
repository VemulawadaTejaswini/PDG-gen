import java.util.*;

public class Main{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	long n=sc.nextInt();
	long a=sc.nextInt();
	long b=sc.nextInt();

	if((b-a)%2==1 && ((a-1)>=(n-b))){
		System.out.println(n-a);
	}else if((b-a)%2==1 && ((a-1)<(n-b))){
		System.out.println(b-1);
	}else if((b-a)%2==0){
		System.out.println((b-a)/2);
}

	
}
}
