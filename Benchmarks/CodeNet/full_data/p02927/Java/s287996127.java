import java.util.*;
public class Main {

 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int m= sc.nextInt();
	int d= sc.nextInt();

	int r=0,dd=d/10;
	for(int i=4;i<=m;i++){
		for(int j=2;j<dd;j++)if(j*2<=i && i%j==0)r++;
		if(dd/2<=i && i%dd==0 && i/dd<=d%10)r++;
	}
	System.out.println(r);
 }
}