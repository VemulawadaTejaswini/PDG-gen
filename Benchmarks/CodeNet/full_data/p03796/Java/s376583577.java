
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int j=1;
	int i=1;
	for(i=1;i<=n;i++){
	j=j*i%(10^9+7);}
	System.out.println(j);
	
}
