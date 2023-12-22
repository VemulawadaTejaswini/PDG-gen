import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next(),t = sc.next();
        String ans = "No";
        for(int i =0;i<s.length();i++){
            if(s.equals(t)){
                ans = "Yes";
                break;
            }
            String tmp = s.substring(s.length()-1);
            String tmpB = s.substring(0,s.length()-1);
            s = tmp + tmpB;
        }
        System.out.println(ans);
    }
}