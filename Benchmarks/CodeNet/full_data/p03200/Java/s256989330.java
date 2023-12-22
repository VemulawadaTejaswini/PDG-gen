import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String S=sc.next();
        int w=0,b=0,count=0,res=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='W') w++;
            else b++;
        }
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='W'){
                res+=i-count;
                count++;
            }
        }
        System.out.println(res);
    }
}