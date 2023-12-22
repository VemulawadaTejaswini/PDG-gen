import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt()-1;
        int b = sc.nextInt()-1;
        int c = sc.nextInt()-1;
        int d = sc.nextInt()-1;
        char[] s = sc.next().toCharArray();
        boolean ans = true;
        boolean cross = d < c;
        int idx = a;
        boolean tmp1 = false;
        while(true){
            if(c - idx < 3){
                tmp1 = true;
                break;
            }
            if(idx+2 < n && s[idx+2] != '#') idx += 2;
            else if(idx+1 < n && s[idx+1] != '#') idx += 1;
            else {
                tmp1 = false;
                break;
            }
        }
        idx = b;
        boolean tmp2 = false;
        while(true){
            if(d - idx < 3){
                tmp2 = true;
                break;
            }
            if(idx+2 < n && s[idx+2] != '#') idx += 2;
            else if(idx+1 < n && s[idx+1] != '#') idx += 1;
            else {
                tmp2 = false;
                break;
            }
        }
        if(tmp1 && tmp2){
            if(cross){
                int tmp = 0;
                int max = 0;
                for (int i = b-1; i <= d+1; i++) {
                    if(s[i] == '.'){
                        tmp++;
                    }else{
                        if(max < tmp) max = tmp;
                        tmp = 0;
                    }
                }
                if(2 < Math.max(max, tmp)) ans = true;
                else ans = false;
            }else{
                ans = true;
            }
        }else{
            ans = false;
        }
        System.out.println(ans ? "Yes":"No");
        sc.close();

    }

}
