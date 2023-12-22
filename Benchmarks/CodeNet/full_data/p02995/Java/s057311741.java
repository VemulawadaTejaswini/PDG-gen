import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        Long a = Long.parseLong(line1[0]);
        Long b = Long.parseLong(line1[1]);
        Long c = Long.parseLong(line1[2]);
        Long d = Long.parseLong(line1[3]);
        Long count1 = b - a + 1;
        //System.out.println(count1);
        Long e;
        if(a % c == 0)
        e = a / c;
        else
        e = a / c + 1;
        Long f = b / c;
        Long count2 = f - e + 1;
        //System.out.println(count2);
        if(a % d == 0)
        e = a / d;
        else
        e = a / d + 1;
        f = b / d;
        Long count3 = f - e + 1;
        //System.out.println(count3);
        Long g = lcm(c, d);
        if(a % g == 0)
        e = a / g;
        else
        e = a / g + 1;
        f = b / g;
        Long count4 = f - e + 1;
        //System.out.println(count4);
        System.out.println(count1 - (count2 + count3 - count4));
    }
    static long lcm (long a, long b) {
	    long temp;
	    long c = a;
	    c *= b;
	    while((temp = a % b)!=0) {
	    	a = b;
	    	b = temp;
	    }
	return (long)(c/b);
    }
}