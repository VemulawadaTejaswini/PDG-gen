import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		// 整数の入力


int A= sc.nextInt();
int B= sc.nextInt();
int C= sc.nextInt();
int K= sc.nextInt();
int max=A;
int sum=0;

	if(max<B && max>C){
		max=B;
	}else{
		max=C;
	}
	int sonota=A+B+C-max;
	for(int i=0; i<K; i++){
		sum=max*2+sonota;
		max=2*max;
	}
	System.out.println(sum);
	}

}
