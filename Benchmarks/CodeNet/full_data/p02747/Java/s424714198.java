import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        String S = sn.next();
        String s = "";
        int flag = 0;
        for(int i=0; i<S.length()/2; i++){
            s += "hi";
            if(s.equals("hi")) {
                flag++;
                System.out.println("Yes");
                break;
            }
        }
        if(flag == 0) System.out.println("No");
        
    }
}