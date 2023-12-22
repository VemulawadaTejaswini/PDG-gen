import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String Ans1 = null;
        String Ans2 = null;
            for(int i = 0; i <= b; i ++){
                Ans1 = String.valueOf(a) + String.valueOf(a);
            }
            for(int i = 0; i <= a; i ++){
                Ans2 = String.valueOf(b) + String.valueOf(b);
            }
        int ques = Ans1.compareTo(Ans2);
        if(ques == -1) {
            System.out.println(Ans1);
        } else  {
            System.out.println(Ans2);    
        }    
        
    }
}
