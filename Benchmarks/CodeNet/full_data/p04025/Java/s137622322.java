
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = IntStream.range(0, N).mapToObj(x -> sc.nextInt())
				.sorted((a, b) -> Integer.compare(b, a))
				.collect(Collectors.toCollection(ArrayList::new));
		int max=list.get(0);
		int min=list.get(list.size()-1);
		int sum=0;
		if ((max+min)%2!=0) {
			int middle1;
			int middle2;
			middle1=(max+min+1)/2;
			middle2=(max+min-1)/2;
			int sum1=0;
			int sum2=0;
			for (int i = 0; i < list.size(); i++) {
				sum1+=Math.pow(list.get(i)-middle1, 2);	
				sum2+=Math.pow(list.get(i)-middle2, 2);	
			}
			if (sum1>sum2) {
				sum=sum2;
			}else {
				sum=sum1;
			}
		}else {
			int middle=(max+min)/2;
			for (int i = 0; i < list.size(); i++) {
				//System.out.println(sum);
				sum+=Math.pow(list.get(i)-middle, 2);	
				//System.out.println(sum);
			}
			
		}
		System.out.println(sum);
		
		
		
		
		
		
	}

}