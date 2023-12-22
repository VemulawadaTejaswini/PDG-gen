import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	sc.close();
    	int max = 0;
    	int tmp = 0;
    	for(int i = 0; i < str.length(); i++){
    		char c = str.charAt(i);
    		if(c == 'A' || c == 'C' || c == 'G' || c == 'T'){
    			tmp++;
    		}else{
    			tmp = 0;
    		}
    		if(max < tmp) max = tmp;
    	}
    	System.out.println(max);
    }
}