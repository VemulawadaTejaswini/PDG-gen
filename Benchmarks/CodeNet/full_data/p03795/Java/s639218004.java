import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),x=1;
		for(int i=1;i<=N;i++){
			x=x*i;
		}
		System.out.println((int)(x%(Math.pow(10,9)+7)));
	}
}