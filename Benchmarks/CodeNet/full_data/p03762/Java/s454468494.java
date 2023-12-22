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
      int mod = 1000000007;
      int xLen = getInt();
      int yLen = getInt();
      Long output = new Long(0);
      Long[] xList = new Long[xLen];
      Long[] yList = new Long[yLen];
      Long xSum = new Long(0);
      Long ySum = new Long(0);
      
      for(int i = 0; i < xLen; i++){
        xList[i] = getLong();
      }
      for(int i = 0; i < yLen; i++){
        yList[i] = getLong();
      }
      for(int i = 1; i <= xLen; i++){
        xSum = (xSum + ((i - 1) * xList[i - 1]) - ((xLen - i) * xList[i - 1])) % mod;
        //myout(xSum);
      }
      for(int i = 1; i <= yLen; i++){
        ySum = (ySum + ((i - 1) * yList[i - 1]) - ((yLen - i) * yList[i - 1])) % mod;
      }
      
  //myout(ySum);
      myout((xSum * ySum) % mod);
	}
}
