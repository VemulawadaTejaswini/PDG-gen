import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int cnt = 0;
        int n = s.length();

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}