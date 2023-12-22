import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<999;i++) {
			int sum=0;
			for(int j=1; j<=i;j++) {
				sum+=j;
			}
			list.add(sum);
		}

		for(int i=0; i<999;i++) {
			if(list.indexOf(a+i) != -1 && list.get(list.indexOf(a+i)+1) == b+i) {
				System.out.println(i);
				return;
			}
		}
	}
}
