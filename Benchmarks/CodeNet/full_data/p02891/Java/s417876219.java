import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        char[] div = s.toCharArray();
        long ans = 0;
        int divnum = s.length()-1;
        
        if(s.charAt(0) == s.charAt(divnum)){
            ans = 1;
            div[divnum] = '0';
        }
        for(int i = 1;i < divnum;i += 2){
            if(div[i-1] == div[i] && div[i] == div[i+1]){
                div[i-1] = '1';
                div[i+1] = '2';
                ans +=2;
            }else if(div[i-1] == div[i] ^ div[i] == div[i+1]){
                div[i+1] = '3';
                ans ++;
            }
        }
        if(k%2 == 0){
            if(div[divnum] == div[divnum-1]){
                ans++;
            }
        }
        ans *= k;

        System.out.println(ans);
    }
}