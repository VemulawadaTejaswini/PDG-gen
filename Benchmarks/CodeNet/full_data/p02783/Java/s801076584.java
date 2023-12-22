import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int h = sc.nextInt();
    	int a = sc.nextInt();
    	sc.close();
    	int cnt = 0;
    	while(0 < h){
    		h = h - a;
    		cnt++;
    	}
    	System.out.println(cnt);
    }
}