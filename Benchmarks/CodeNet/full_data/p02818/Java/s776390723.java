import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int i = 0;

        if(a > 0 && b > 0) {

                while (i < k) {
                    while (a > 0) {
                        a--;
                        i++;
                        if (a == 0) {
                            while (b > 0) {
                                if (i < k) {
                                    b--;
                                    i++;
                                }
                                else {
                                    break;
                                }
                            }
                        }
                    }
                }

            System.out.println(a + "" + b);
        }
        else if (a == 0 && b == 0) {
            System.out.println(a + "" + b);
        }

        else if (a == 0 && b > 0) {
            while (b > 0) {
                if (i < k) {
                    b--;
                    i++;
                }
                else {
                    break;
                }
            }
            System.out.println(a + "" + b);
        }


    }
}
