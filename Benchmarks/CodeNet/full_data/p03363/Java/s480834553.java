import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<>();
		int count =0;
		for(int i = 0;i<N;i++){
			numbers.add(sc.nextInt());
		}
		for(int i=0;i<N-1;i++){
			int volume = numbers.get(i);
			for(int j=i+1;j<N;j++){
				volume += numbers.get(j);
				if(volume==0){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
