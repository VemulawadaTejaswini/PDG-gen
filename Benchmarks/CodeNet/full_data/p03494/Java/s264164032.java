import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int minIndex2 = 32;
		for(int i = 0 ; i < N ; i ++){
			int A = sc.nextInt();
			int index2 = 0 ;
			
			while(A % 2 == 0){
				A = A /2 ;
				index2 ++ ;
			}
			if(minIndex2 > index2){
				minIndex2 = index2;
			}
		}
		System.out.println(minIndex2);
	}
}
