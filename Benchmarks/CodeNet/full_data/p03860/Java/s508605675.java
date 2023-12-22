import java.util.Scanner;
public class JavaApplication4 {
    public static void main(String[] args) 
    {
        Scanner x =new Scanner(System.in);
        String s,s2,s3,c,z,v;
        s=x.next();
        s2=x.next();
        s3=x.next();
        c=s.toUpperCase();
        z=s2.toUpperCase();
        v=s3.toUpperCase();
        System.out.printf("%s%s%s\n",c.charAt(0),z.charAt(0),v.charAt(0));
    }
}