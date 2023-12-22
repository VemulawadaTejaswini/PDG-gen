import java.util.*;
class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      long t=1;
      for(int i=0;i<n;i++)t=getLCM(t,sc.nextLong());
      System.out.print(t);
    }
	
	public static long getLCM(long x, long y) {
    return x / getGCD(x, y) * y;//先に割り算をして掛けられる数を小さくして掛け算を行う
	}
	public static long getGCD(long x, long y) {
        long biggerNum = Math.max(x, y);
        long smallerNum = Math.min(x, y);
        long surplus = biggerNum % smallerNum;
        if (surplus == 0) {
            return smallerNum;
        }
        surplus = getGCD(smallerNum, surplus);

        return surplus;
    }
}