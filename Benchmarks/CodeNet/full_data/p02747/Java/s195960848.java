import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        String S = sn.next();
        int flag=0;
        for(int i=0; i+1<S.length(); i++){
            if(S.substring(i, i+2).equals("hi")) {
                if(!S.substring(i+2, i+3).equals("i"))
                flag = 1;
            }
        }
        if(flag == 0) System.out.println("No");
        else System.out.println("Yes");
    }
}