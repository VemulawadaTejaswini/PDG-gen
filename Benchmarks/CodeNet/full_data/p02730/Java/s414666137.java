import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        String kai = sb.reverse().toString();
        if(!s.equals(kai)){
            System.out.println("No");
            return;
        }
        String s2 = s.substring(0, (s.length()-1)/2);
        StringBuffer sb2 = new StringBuffer(s2);
        String kai2 = sb2.reverse().toString();
        if(!s2.equals(kai2)){
            System.out.println("No");

            return;
        }
        String s3 = s.substring(((s.length()+3)/2)-1 , s.length());
        StringBuffer sb3 = new StringBuffer(s3);
        String kai3 = sb3.reverse().toString();
        if(!s3.equals(kai3)){
            System.out.println("No");

            return;
        }
        System.out.println("Yes");
    }
}