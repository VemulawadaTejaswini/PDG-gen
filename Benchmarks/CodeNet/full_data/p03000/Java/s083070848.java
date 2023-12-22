import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int z =0;
		int j=0;
		List<Integer> list=new ArrayList<Integer>();

		for(int i=0;n>i;i++) {
			int l=sc.nextInt();
			list.add(l);
		}

		while(true) {
			z=z+list.get(j);
			if(z>x) {
				break;
			}
			if(j+1==n) {
				j++;
				break;
			}
			j++;
		};

		System.out.println(j+1);

	}

}
