import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String O = sc.next();
        String E = sc.next();
        int O_num = O.length();
        int E_num = E.length();
        int remainder = 0;
        remainder = O_num - E_num;
        String sum = "";
        for(int i = 0; i < O.length();i++){
            sum = sum + O.charAt(i);
            if(remainder == 1 && i == O_num -1){
                continue;
            }
            sum = sum + E.charAt(i);
        }
        System.out.println(sum);
    }
}