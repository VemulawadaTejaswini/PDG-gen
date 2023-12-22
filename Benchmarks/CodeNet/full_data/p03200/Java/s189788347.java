import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        StringBuilder S = new StringBuilder(sc.next());
        int count=0;
    
        for(;;){
            int tmpCount = count;
                
            for(int i = 0;i < S.length()-1;i++){
                //System.out.println(S);
                if(S.charAt(i)=='B'&&S.charAt(i+1)=='W'){
                    S.replace(i,i+2,"WB");
                    count++;
                }
            }
            if(tmpCount==count){
                System.out.println(count);
                System.exit(0);
            }
        }
    }
}
