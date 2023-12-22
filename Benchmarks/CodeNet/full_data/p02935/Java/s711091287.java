import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =    sc.nextInt();
		int num = 0;
		int arnum[] = new int[a];
		int num1 = 0;
		int num2 = 0;
		
		for(int i = 0; i < a;i++) {
			int b =    sc.nextInt();
			arnum[i] = b;
		}
		Arrays.sort(arnum);
		num = arnum[0] + arnum[1] / 2;
		for(int i = 2; i < arnum.length;i++) {
			num = arnum[i] + num / 2;
		}
		
       System.out.println(num);
	}
}