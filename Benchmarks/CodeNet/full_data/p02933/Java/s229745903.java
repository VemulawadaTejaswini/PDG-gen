 import java.util.*;
  public class Main {
      public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.next();
		sc.close();
		String red = "red";
		if(a<3200){
			System.out.println(red);
		}else{
			System.out.println(s);
		}
      }
  }