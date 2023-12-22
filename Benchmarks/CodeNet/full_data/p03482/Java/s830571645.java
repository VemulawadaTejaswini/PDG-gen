import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] s=sc.next().toCharArray();
        sc.close();
        int n=s.length;
        int min=n;
        for(int i=1;i<n;i++){
            if(s[i]!=s[i-1]){
                min=Math.min(min, Math.max(i, n-i));
            }
        }
        System.out.println(min);
    }
}
