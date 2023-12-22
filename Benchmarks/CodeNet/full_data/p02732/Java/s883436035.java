import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		int[] array = new int[2000000];
		Long[] tori = new Long[2000000];
		int n = sc.nextInt();

		for(int i=0;2000000>i;i++) {
			array[i]=0;
		}

		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			array[a]++;
			list.add(a);
		}

		for(int i=0;2000000>i;i++) {
			tori[i]=(long) ((array[i]*(array[i]-1))/2);
		}

		long goukei=0;

		for(int i=0;2000000>i;i++) {
			goukei=goukei+tori[i];
		}

		for(int i=0;n>i;i++) {
			int a = list.get(i);
			System.out.println(goukei-array[a]+1);
		}

	}
}