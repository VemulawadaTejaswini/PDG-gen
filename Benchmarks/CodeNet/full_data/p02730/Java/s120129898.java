import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
//        String[] array = str.split("");

        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();

//        boolean flg1, flg2, flg3;
        int n = str.length();
        String str2 = str.substring(0, (n-1)/2);
        String str3 = str.substring((n+3)/2 -1);

        StringBuffer sb2 = new StringBuffer(str2);
        String reverse2 = sb2.reverse().toString();

        StringBuffer sb3 = new StringBuffer(str3);
        String reverse3 = sb3.reverse().toString();
//
//        System.out.println(str);
//        System.out.println(reverse);
        if (str.equals(reverse)){
//            System.out.println(str2);
//            System.out.println(reverse2);
            if (str2.equals(reverse2)){
//                System.out.println(str3);
//                System.out.println(reverse3);
                if (str3.equals(reverse3)){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }else{
                System.out.println("No");
            }
        }else {
            System.out.println("No");
        }
    }
}