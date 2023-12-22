import java.util.*;
public class Main {

 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int m= sc.nextInt();
	int d= sc.nextInt();

	int r=0,dd=d/10;d=d%10;
	if(dd>1){
	for(int i=4;i<=m;i++){
		for(int j=2;j<dd;j++)if(j*2<=i && i%j==0 && i/j<=9)r++;
		if(dd*2<=i && i%dd==0 && i/dd<=d)r++;
	}
	}
	System.out.println(r);
 }
}