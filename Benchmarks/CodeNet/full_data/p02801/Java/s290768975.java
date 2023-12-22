import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a= sc.next();
        char[] b= a.toCharArray();
        if(b[0]>='a'&&b[0]<'z')
            b[0]++;
        char ch = (char)(b[0]);
        System.out.println(ch);
    }}