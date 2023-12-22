import java.util.*;

public class Main{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int n =0;
	int a=0;
	int b=0;
	n=sc.nextInt();
	a=sc.nextInt();
	b=sc.nextInt();

	if((b-a)%2==1){
		System.out.println(b-1);
	}else if((b-a)%2==0){
		System.out.println((b-a)/2);
	}
}
}
