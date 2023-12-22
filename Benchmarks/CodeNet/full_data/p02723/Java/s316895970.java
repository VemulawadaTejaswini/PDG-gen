import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n =s.length();
    char s1 =s.charAt(2);
    char s2 =s.charAt(3);
    char s3 =s.charAt(4);
    char s4 =s.charAt(5);
    if(n==6&&s1==s2&&s3==s4){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
}
}