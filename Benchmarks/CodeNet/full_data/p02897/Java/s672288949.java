
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 //     String[] sn=sc.nextLine().split(" ");
//int num=Integer.parseInt(sn[0]);
//int num2=Integer.parseInt(sn[1]);

      String sn=sc.nextLine();
int num=Integer.parseInt(sn);


double a=0;
double b=0;


if(num%2==0){
a=1;
b=2;
System.out.println(a/b);

}else{
a=num/2 +1;
b=(double)num;
System.out.println(a/b);

}

	}
}