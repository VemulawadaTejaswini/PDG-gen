import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        sc.close();

        String[] strArray = S.split("");

        int count=0;
        String a,b=null;
        a = strArray[0];

        if (strArray[1].equals(a)){
            if (strArray[2].equals(a)){
                System.out.println("No");
                return;
            }else{
                b = strArray[2];
                if (strArray[3].equals(a) || strArray[3].equals(b)){
                    System.out.println("Yes");
                    return;
                }else{
                    System.out.println("No");
                    return;
                }
            }
        }else{
            b = strArray[1];
            if (strArray[2].equals(a) || strArray[2].equals(b)){
                if (strArray[3].equals(a) || strArray[3].equals(b)){
                    System.out.println("Yes");
                    return;
                }else{
                    System.out.println("No");
                    return;
                }
            }else {
                System.out.println("No");
                return;
            }
        }
    }
}