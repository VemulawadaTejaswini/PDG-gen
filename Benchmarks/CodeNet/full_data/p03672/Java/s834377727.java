import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=0;
        for(int i=s.length()-1;i>=0;i--){
            if(i%2!=0) continue;
            if(s.substring(0,i/2).equals(s.substring(i/2,i))){
                a=i;
                break;
            }
        }
        System.out.println(a);
    }
}