import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String S;
        StringBuilder S_List = new StringBuilder();
        S = sc.next();
        S_List.append(S);
        long num2 = 1000000;
        for(int a=0;a<S.length()-1;a++){
            if(S_List.charAt(a)!=S_List.charAt(a+1)){
                long num=S_List.length()-(a+1);
                if(num>a){
                    if(num>=2&&num2>num) num2 = num;
                }
                else if(num<=a){
                    if(a>=2&&num2>num)num2 =num;
                }
            }
        }
        System.out.println(num2);
    }
}