

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s =sc.next();
        char a[] = s.toCharArray();
        int count = 0 ;
        for(int i = 0 ; i<s.length() ; i++){
            if((i%2)==0)
            {
                if(a[i]=='R'|a[i] =='U'|a[i] =='D')count++;
            }
            else
            {
                if(a[i]=='L'|a[i]=='U'|a[i]=='D')count++;
            }
            
        } if(s.length() == count) System.out.println("Yes");
        else System.out.println("No");
    }
}
