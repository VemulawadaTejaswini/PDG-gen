import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
int x[]=new int[100002];
Arrays.fill(x,0);
int h;
for(int i=1;i<=n;i++){
h=sc.nextInt();
h++;
x[h]++;
x[h+1]++;
x[h-1]++;
}
Arrays.sort(x);
System.out.println(x[100001]);

	}}