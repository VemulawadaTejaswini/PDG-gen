import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
int[] p=new int[N];
int c=0;
int d=0;
		// スペース区切りの整数の入力
for(i=0;i<N;i++){
		int p[i] = sc.nextInt();
}
		// 出力
if(p[N-1]==N){
c++;
d=p[N-2];
p[N-2]=p[N-1];
p[N-1]=d;
 
}
for(i=0;i<N-1;i++){
if(p[i]==i+1){
c++;
d=p[i];
p[i]=p[i+1];
p[i+1]=d;
}
}
		System.out.println(c);
	}
}