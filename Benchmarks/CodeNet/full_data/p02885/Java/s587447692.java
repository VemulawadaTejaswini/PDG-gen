
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] sn=sc.nextLine().split(" ");
int num=Integer.parseInt(sn[0]);
int num2=Integer.parseInt(sn[1]);

if(1>num2-num*2){
System.out.println(0);

}else{

System.out.println(num2-num*2);
}

	}
}