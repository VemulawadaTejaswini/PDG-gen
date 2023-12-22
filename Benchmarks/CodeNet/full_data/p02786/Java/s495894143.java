import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	long h = sc.nextLong();
    	sc.close();
    	System.out.println(cntUp(h));
    }

    static long cntUp(long h){
    	if(1 == h){
    		return 1L;
    	}
    	else{
    		return cntUp(h / 2) * 2 + 1;
    	}
    }
}