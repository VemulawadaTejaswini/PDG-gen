import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String S=sc.next();
        int lastB=S.length()-1,found=0,res=0;
        for(int i=S.length()-1;i>=0;i--){
            if(S.charAt(i)=='B'){
                found=i;
                res+=lastB-found;
                lastB--;
            }
        }
        System.out.println(res);
    }
}