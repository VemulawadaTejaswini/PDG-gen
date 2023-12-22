import java.util.*;
public class Main {
	public static void myout(Object text){//standard output
		System.out.println(text);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      Long a = sc.nextLong();
      Long b = sc.nextLong();
      Long x = sc.nextLong();
      Long output = new Long(0);
      if(a > 0){
        output = ((a - 1) / x + 1);
      }
      
      if(b > 0){
        output = (b / x + 1) - output;
      }else{
        output = new Long(1);
      }
      myout(output);
	}
}
