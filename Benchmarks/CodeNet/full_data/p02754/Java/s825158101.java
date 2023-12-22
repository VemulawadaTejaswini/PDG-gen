import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int aCount = 0;
      	aCount += n/(a+b);
		if(n%(a+b)>a){
			aCount+=a;
		}else{
			acount+=n%(a+B);
		}
		System.out.print(aCount);
	}
}