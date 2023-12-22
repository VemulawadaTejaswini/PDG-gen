import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力(AとB)
		long A = sc.nextLong();
		long B = sc.nextLong();
      	long partA = 0;
      	long partB = 0;
      	long answer = A;
      	
      	for(long i=0;i<B;i++){
          partB = partB^(i+1);
        }
      	for(long i=0;i<(A-1);i++){
           partA = partA^(i+1);
        }
          answer = partA^partB;
		System.out.println(answer);
	}
}