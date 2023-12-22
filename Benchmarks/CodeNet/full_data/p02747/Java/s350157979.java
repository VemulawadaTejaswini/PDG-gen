import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        String S = sn.next();
        int flag=0;
        for(int i=0; i+1<S.length(); i+=2){
            if(!S.substring(i, i+2).equals("hi")) {
                flag = 1;
                break;
            }
        }
        if(flag == 1) System.out.println("No");
        else System.out.println("Yes");
    }
}