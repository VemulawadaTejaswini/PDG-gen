import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        boolean ans = true;
        for (int i = 0; i < s.length; i++) {
            if(i % 2 == 0){
                if(s[i] == 'L'){
                    ans = false;
                    break;
                }
            }else{
                if(s[i] == 'R'){
                    ans = false;
                    break;
                }
            }
        }
        System.out.println(ans ? "Yes" : "No");
        sc.close();

    }

}
