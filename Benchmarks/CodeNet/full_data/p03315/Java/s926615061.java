import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int plus = 0;
        int minus = 0;
        String a = sc.nextLine();
        char[] b = a.toCharArray();
        for(int i = 0; i < a.length(); i++){
            if(b[i] == '+'){
                plus++;
            } else if(b[i] == '-'){
                minus++;
            }
        }
        System.out.println(plus - minus);
    }
}
