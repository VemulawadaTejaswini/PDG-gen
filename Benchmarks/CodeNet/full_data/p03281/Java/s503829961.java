import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		int count=0;
		if(n<105) {
			System.out.println(0);
			System.exit(0);
		}
		else {
			for(int i=105;n+1>i;i=i+2) {
				int how =0;
				for(int j=1;i+1>j;j++) {
					if(i%j==0)
						how++;
				}
				if(how==8) {
					count++;
				}
				//System.out.println(how);
			}
		}
		System.out.println(count);
	}
}