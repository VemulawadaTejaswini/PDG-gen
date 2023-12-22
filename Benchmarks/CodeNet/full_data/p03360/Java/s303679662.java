import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		// 整数の入力


int A= sc.nextInt();
int B= sc.nextInt();
int C= sc.nextInt();
int K= sc.nextInt();
int max=A;
int sonota=B+C;
int sum=0;

	if(max<B){
		if(B<C){
			max=C;
			sonota=B+A;	
		}else{
			max=B;
			sonota=A+C;
		}
		
	}else{
		if(C<max){
			max=A;
			sonota=B+C;
		}else{
			max=C;
			sonota=A+B;
		}
	}


	for(int i=0; i<K; i++){
		sum=max*2+sonota;
		max=max*2;
	}
	System.out.println(sum);
	}

}
