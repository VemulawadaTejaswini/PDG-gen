import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
double n=sc.nextDouble();
double s=0;
for(int i=1;i<=n;i++){
	if(i%2==1){
s++;
	}
}
System.out.println(s/n);
	}
}