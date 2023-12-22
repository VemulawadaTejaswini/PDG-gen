import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        boolean res=check(s,0,n-1)&&check(s,0,(n-1)/2-1)&&check(s,(n+3)/2-1,n-1);
        if(res)System.out.println("Yes");
        else System.out.println("No");
    }
    public static boolean check(String s,int start, int end)
    {
        int i=start,j=end;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}