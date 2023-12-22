import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        String s=sc.next();
        int x=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I') x++;
            else x--;
            max=Math.max(x,max);
        }
        System.out.println(max);
    }
}