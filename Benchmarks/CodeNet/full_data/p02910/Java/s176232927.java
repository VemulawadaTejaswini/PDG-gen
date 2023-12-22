import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        String  s=cin.next();
        boolean sign=true;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='U'||c=='D') continue;
            if( i%2==0 && c!='R' ){
                System.out.println("No");
                sign=false;
                break;
            }
            else if(i%2!=0 && c!='L'){
                System.out.println("No");
                sign=false;
                break;
            }
        }
        if(sign)
            System.out.println("Yes");
        cin.close();
    }

}
