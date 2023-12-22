import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        if(judge(w)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    static boolean judge(String s){
        int [] a = new int [26];
        for(int i=0; i<s.length(); i++){
            int t = s.charAt(i)-'a';
            a[t]++;
        }
        for(int j=0; j<26; j++){
            if(a[j]%2==1){
                return false;
            }
        }
        return true;
    }
}