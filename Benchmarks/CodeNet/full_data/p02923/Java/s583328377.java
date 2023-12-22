import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine());
		Long[] arr=Arrays.asList(sc.nextLine().split(" "))
				.stream().map(Integer::valueOf).toArray(Long[]::new);
		int result=0;
		for(int i=1,c=0;i<N;i++) {
			if(arr[i-1]>=arr[i]) {
				c++;
			}else {
				result=c>result?c:result;
				c=0;
			}
		}
		System.out.println(result);
	}
}