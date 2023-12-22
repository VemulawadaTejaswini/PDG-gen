import java.util.Scanner;
public class Main {
    static int N,K;
    static int[] arrInput;
    static int dis = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		arrInput = new int[N];
		
		int insertIndex=0;
		for(int i=0;i<N;i++){
			arrInput[i] = sc.nextInt();
			if(0>arrInput[i]){
				insertIndex++;
			}
		}
		
		if(insertIndex==0){
			int startIndex=-1;
			for(int i=0;i<N;i++){
				if(K==0){
					break;
				}
				if(i==0){
					dis += Math.abs(0-arrInput[i]);
				}else{
					dis += Math.abs(arrInput[startIndex]-arrInput[i]);
				}
				K--;
				startIndex++;
			}
			
		}
		else if(insertIndex-1==N-1){
			int startIndex=N-1;
			for(int i=N-1;i>0;i--){
				if(K==0){
					break;
				}
				if(i==N-1){
					dis += Math.abs(0-arrInput[i]);
				}else{
					dis += Math.abs(arrInput[startIndex]-arrInput[i]);
				}
				K--;
				startIndex--;
			}
		}
		else{
			for(int i=0;i+K-1<N;i++){
				int j = i+K-1;
				int min = arrInput[i];
				int max = arrInput[j];
				int temp;
				temp = Math.min(-2*min+max, -min+2*max);
				if(dis>temp){
					dis = temp;
				}
			}
		}
		System.out.println(dis);
	}
	
	
}