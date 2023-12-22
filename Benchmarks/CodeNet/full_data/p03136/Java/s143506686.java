
import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int N = sc.nextInt();
	if(N>=3&&N<=10){
	    int L[] = new int[N];
	    int c=0;
	    for(int i=0;i<N;i++){
		L[i]= sc.nextInt();
		if(L[i]>=1 && N<=100)c++;
	    }

	    if(c==N){
		int max=0;
		for(int i=0;i<N-1;i++){
		    if(i==0)max=L[i];
		    if(max<L[i+1])max=L[i+1];
		}

		int sum=0;
		for(int i=0;i<N;i++){
		    if(L[i]!=max)sum=sum+L[i];
		}

		if(max<sum)System.out.println("Yes");
		else System.out.println("No");
	    }else System.out.println("No");
	}else System.out.println("No");
    }
}
