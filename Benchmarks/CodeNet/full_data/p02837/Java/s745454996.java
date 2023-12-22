import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		if(n==2) {
			System.out.println(1);
		}
		else {
			Integer[][] array = new Integer[n+1][n+1];
			for(int i=0;n>i;i++) {
				for(int j=0;n>j;j++) {
					array[i+1][j+1]=2;
				}
			}
			for(int i=0;n>i;i++) {
				int a = sc.nextInt();
				for(int j=0;a>j;j++) {
					int human = sc.nextInt();
					int which = sc.nextInt();
					array[i+1][human] = which;
				}
			}
			int answer=0;
			for(int i=0;n>i;i++) {
				List<Integer> list=new ArrayList<Integer>();
				for(int j=0;n>j;j++) {
					int get = array[j+1][i+1];
					list.add(get);
				}
				//System.out.println(list);
				loop:for(int j=0;list.size()>j;j++) {
					if(list.get(j)==0) {
						for(int k=0;list.size()>k;k++) {
							if(list.get(k)==1) {
								answer++;
								break loop;
							}
						}
					}
				}
			}
			System.out.println(n-answer);
		}
	}
}