import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] sa = s.toCharArray();
        int ans = 0;
        for(int i = 0;i<n-1;i++){
            if(sa[i]=='A'&&sa[i+1]=='B'&&sa[i+2]=='C'){
                ans ++;
            }
        }
        System.out.println(ans);
    }
}