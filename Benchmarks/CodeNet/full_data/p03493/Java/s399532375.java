import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;
        
    	for(char c: str.toCharArray()){
	    	if(c == '1'){
		    	count++;
		    }
	    }
        
        System.out.println(count);
        scan.close();
    }
}
