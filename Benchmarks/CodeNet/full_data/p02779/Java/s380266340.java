import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	static boolean check(int A[]){
//		for(int i=0;i<(n-i);i++){
//			for(int j=(i+1);j<(n-i-1);j++){
//				if(A[i]==A[j]){
//					System.out.println("NO");
//
//				}
//				else
//					System.out.println("Yes");
//			}
//		}
		Arrays.sort(A);
		for (int i = 0; i < A.length-1; i ++){
			if (A[i+1] == A[i]){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] argus){
	Scanner input=new Scanner(System.in);
	int n = input.nextInt();
	int[] A = new int[n];
	for(int i=0;i<n;i++){
		A[i]=input.nextInt();
	}
//	display(n,A);
	if(check(A)){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}

}

}