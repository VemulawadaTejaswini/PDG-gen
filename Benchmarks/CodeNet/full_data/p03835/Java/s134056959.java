import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
int s=sc.nextInt();
int x=0;
int count=0;
int y=0;int z=0;
for(int i=0;i<=k;i++) {
	for(int j=0;j<=k;j++) {
		for(int h=0;h<=k;h++) {
			if(i+j+h==s) {
				count++;
			}
		}
}
}
System.out.println(count);
	}

}