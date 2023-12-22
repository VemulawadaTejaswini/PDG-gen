import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[] = new int[n];
	int count = 0;

	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();
	}
	while(true) {
		boolean jud = false;
		for(int i=0;i<n;i++) {
			if(a[i]%2==1) {
				jud = true;
			}
		}
		if(jud==true) {break;}
		for(int i=0;i<n;i++) {
			a[i] = a[i]/2;
		}
		count++;
	}
			System.out.println(count);
	}
}