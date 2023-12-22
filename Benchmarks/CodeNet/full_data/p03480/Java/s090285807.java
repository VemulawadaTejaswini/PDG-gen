import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String S;
        StringBuilder S_List = new StringBuilder();
        S = sc.next();
        S_List.append(S);
        int num2 =1000000000;
        for(int a=0;a<S.length()-1;a++){
            if(S_List.charAt(a)!=S_List.charAt(a+1)){
                if(a+1>S_List.length()-a-1) num2 = Math.min(num2,a+1);
                else num2 = Math.min(num2,S_List.length()-a-1);
            }
        }
        System.out.println(num2);
    }
}
