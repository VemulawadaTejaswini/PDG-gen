import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		for(int i=0;i<N;i++){
			int tmp = sc.nextInt();
			if(max < tmp)max=tmp;
			else if(max-2>=tmp){
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}