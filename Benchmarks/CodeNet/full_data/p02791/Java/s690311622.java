import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	long n = sc.nextLong();
    	long cnt = 1;
    	long t = sc.nextLong();
    	for(int i = 1; i < n; i++){
    		long m = sc.nextLong();
    	    if(t > m){
    	    	cnt++;
    	    	t = m;
    	    }
    	}
    	System.out.println(cnt);
    	sc.close();
    }
}