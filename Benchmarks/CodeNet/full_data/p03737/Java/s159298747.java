
import java.math.BigInteger;
import java.util.*;
public class Main {





public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
char a=sc.next().charAt(0);
char b=sc.next().charAt(0);
char c=sc.next().charAt(0);
String aa=""+a;
String bb=""+b;
String cc=""+c;
System.out.println(aa.toUpperCase()+bb.toUpperCase()+cc.toUpperCase());
}

}

class pair{
	int x,y;
	pair(int x,int y){
		this.x=x;
		this.y=y;
	}
}
