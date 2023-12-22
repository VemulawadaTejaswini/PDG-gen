import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        boolean c=false,f=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='C')
                c=true;
            if(s.charAt(i)=='F'&&c)
                f=true;
        }
        if(c &&f)
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}
