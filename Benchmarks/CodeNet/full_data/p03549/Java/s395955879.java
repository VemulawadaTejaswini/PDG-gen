import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int tle = sc.nextInt();
        int ac = n-m;        
        System.out.println((ac*100 + tle*1900)*Math.pow(2,tle));
    }
}