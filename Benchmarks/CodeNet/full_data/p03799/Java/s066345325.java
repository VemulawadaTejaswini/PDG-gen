import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void myout(Object text){System.out.println(text);}
	public static String getStr(){return sc.next();}
	public static int getInt(){return sc.nextInt();}
	public static Long getLong(){return sc.nextLong();}
	public static boolean isNext(){return sc.hasNext();}
	public static void main(String[] args){
		//String tmp = getStr();
		//int tmp = getInt();
		//Long tmp = getLong();
      Long output = new Long(0);
      Long N = getLong();
      Long M = getLong();
      if(N >= M / 2){
        output = M / 2;
      }else{
        output = N + ((M - (N * 2)) / 4);
      }
      myout(output);
	}
}
