import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String S =sc.nextLine();
        int w = sc.nextInt();
        char[] str = S.toCharArray();
        StringBuilder sb =new StringBuilder();
        for (int i=0;i<str.length;i=i+w) {
            sb.append(str[i]);
        }
        System.out.println(sb.toString());
    }

}
