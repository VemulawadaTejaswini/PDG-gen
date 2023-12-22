import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String s;
        int flag;
        flag=0;
        s=scan.next();
        for(int i=0;i<s.length()-1;i+=2){
            if(s.charAt(i)=='h'&&s.charAt(i+1)=='i'){
                flag=1;
            }
            else{
                flag=0;
                break;
            }
        }
        if(s.equals("h")||s.equals("i")) System.out.println("No");
        else if(s.length()%2==1) System.out.println("No");
        else if(flag==1) System.out.println("Yes");
        else System.out.println("No");
    }
}