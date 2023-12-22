import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "Yes";
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (i % 2 == 0){
                if (ch == 'L'){
                    ans = "No";
                }
            }
            else{
                if (ch == 'R'){
                    ans = "No";
                }
            }
        }
        System.out.println(ans);
    }
}