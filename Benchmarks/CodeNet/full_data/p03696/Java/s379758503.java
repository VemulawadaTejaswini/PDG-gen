import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		char[] S = new char[N];
		for(int i=0;i<N;i++){
			S[i] = str.charAt(i);
		}
		int[] depth = new int[N];
		int deptA = 0;
		int deptB = 0;
		for(int i=0; i<N;i++){
			if(S[i]=='('){
				deptA++;
				depth[i] = deptA;
			}else{
				if(i>0 && S[i-1]=='('){
					depth[i-1]--;
					depth[i] = depth[i-1];
					deptA--;
				}else{
					deptB--;
					depth[i] = deptB;
				}
			}
		}
		for(int i=0;i<-deptB;i++){
			System.out.print("(");
		}
		System.out.print(str);
		for(int i=0;i<deptA;i++){
			System.out.print(")");
		}
	}
}
