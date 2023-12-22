import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[2000000];
		int n = sc.nextInt();
		for(int i=0;n-1>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		int bango=0;
		int[] array = new int[n];
		for(int i=0;n>i;i++) {
			array[i]=0;
		}

		loop: for(int i=0;n-1>i;i++) {
			if(bango==0) {
				for(int j=0;n-1>j;j++) {
					if(list.get(j)==bango+1) {
						array[i]++;
					}
				}
				bango++;
				continue loop;
			}
			if(list.get(i)==bango) {
				for(int j=0;n-1>j;j++) {
					if(list.get(j)==bango+1) {
						array[i]++;
					}
				}
				bango++;
				continue loop;
			}
		}

		for(int i=0;n>i;i++) {
			System.out.println(array[i]);
		}

	}
}