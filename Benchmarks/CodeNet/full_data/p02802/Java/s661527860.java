import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list_ac=new ArrayList<Integer>();
		List<Integer> list_wa=new ArrayList<Integer>();
		//int[] array_k = new int[100000];
		int n = sc.nextInt();
		int m = sc.nextInt();
		loop:for(int i=0;m>i;i++) {
			int p = sc.nextInt();
			String s = sc.next();
			if(s.equals("AC")){
				for(int j=0;list_ac.size()>j;j++) {
					if(list_ac.get(j)==p) {
						continue loop;
					}
				}
				list_ac.add(p);
			}
			else {
				for(int j=0;list_ac.size()>j;j++) {
					if(list_ac.get(j)==p) {
						continue loop;
					}
				}
				list_wa.add(p);
			}
		}
		System.out.println(list_ac.size()+" "+list_wa.size());
	}
}