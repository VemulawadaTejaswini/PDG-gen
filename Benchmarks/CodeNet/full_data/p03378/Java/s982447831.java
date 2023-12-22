import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int x = stdIn.nextInt();
		int back = 0;
		int go = 0;
		int[] a = new int[m];
		int i;
		for(i = 0; i < m; i++)
			a[i] = stdIn.nextInt();
		for(i = 0; a[i] < x; i++)
			back++;
		for(i = m-1; a[i] > x; i--)
			go++;
		if(back < go)
			System.out.println(back);
		else
			System.out.println(go);
	}
}