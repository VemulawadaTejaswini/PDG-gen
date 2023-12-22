import java.util.Scanner;

public class Main {

	static long cnt = 0;

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	long h = sc.nextLong();
    	sc.close();
    	cntup(h);
    	System.out.println(cnt);
    }

    static void cntup(long h){
    	if(1 == h){
    		h = 0;
    		cnt++;
    	}if(1 < h){
    		long t = h / 2;
    		cnt++;
    		cntup(t);
    		cntup(t);
    	}
    }
}