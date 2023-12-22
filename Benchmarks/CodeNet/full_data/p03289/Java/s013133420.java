package ABC104;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.startsWith("A")){
            char[] ss = s.toCharArray();
            int n =0;
            for (int i=1; i<ss.length;i++) {
                if (i >= 2 && i <= ss.length - 2) {
                    if (ss[i] == 'C') {
                        if (n == 1){
                            System.out.print("WA");
                            System.exit(0);
                            n+=1;
                        }
                    }
                }else if (Character.isUpperCase(ss[i])) {
                        System.out.print("WA");
                        System.exit(0);
                }
            }
            if (n != 0){
                System.out.print("AC");
            }else{
                System.out.print("WA");
            }
        }
    }
}