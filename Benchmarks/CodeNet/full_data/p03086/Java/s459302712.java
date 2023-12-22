import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 0;
        for(int i = 0; i < s.length(); i++){
        	int count = 0;
            for(int x = 0; x < s.length(); x++){
                if(s.substring(x, x + 1).equals("A")||s.substring(x, x + 1).equals("C")||s.substring(x, x + 1).equals("G")||s.substring(x, x + 1).equals("T")){
                	count++;
                }else{
                	break;
                }
            }
            if(max < count){
            	max = count;
            }
        }
        System.out.println(max);
    }
}