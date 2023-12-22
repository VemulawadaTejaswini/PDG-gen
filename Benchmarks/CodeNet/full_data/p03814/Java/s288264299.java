import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s= sc.next().toCharArray();
        int ans = 0;
        outloop:for(int i = 0;i<s.length;i++){
            if(s[i]=='A'){
                for(int j = i+1;j<s.length;j++){
                    if(s[j]=='Z'){
                        ans = j-i+1;
                    }
                }
                break outloop;
            }
        }
        System.out.println(ans);
    }
}