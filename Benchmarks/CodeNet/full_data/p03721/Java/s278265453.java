import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int [] A = new int [N];
        int [] B = new int [N];
        int sum = 0;
        for(int i=0;i<N;i++){
        	A[i] = scan.nextInt();
        	B[i] = scan.nextInt();
        }
        for(int i=0;i<N;i++){
        	for(int j=i+1;j<N;j++){
        		if(A[i]>A[j]){
        			int temp =A[i];
        			int temps =B[i];
        			A[i]=A[j];
        			B[i]=B[j];
        			A[j]=temp;
        			B[j]=temps;
        		}
        	}
        }
        for(int i=0;i<N;i++){
        	sum +=B[i];
        	if(sum>=K){
        		System.out.println(A[i]);
        		break;
        	}
        }
	}

}
