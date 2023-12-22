import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String res = sc.next();
        int cnt = 0;
        for(int i = 0;i < res.length();i++){
            char r = res.charAt(i);
            if(r == 'o')
            cnt++;
        }
        if(cnt >= 8){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}