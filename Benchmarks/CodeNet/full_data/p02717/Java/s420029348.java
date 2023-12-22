
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();
		swap(a,0,1);
		swap(a,0,2);
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
		sc.close();
	}

	private void swap(int a[], int i, int j) {
		int tmp =a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
}
