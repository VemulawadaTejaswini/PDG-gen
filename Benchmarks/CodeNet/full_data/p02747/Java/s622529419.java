import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String hitachi = stdIn.next();
        //System.out.println(hitachi);

        //String hitachi = "";
//        if (args == null || args.length != 1) {
//            System.out.println("No");
//            System.exit(0);
//        }else {
            //hitachi = args[0];
            if(hitachi.length() > 10 || hitachi.length() == 0) {
                System.out.println("No");
                //System.exit(0);
                return;
            }
            if(!hitachi.matches("[a-z]*")) {
                System.out.println("No");
                System.exit(0);
            }
            if(hitachi.contains(" ")) {
                System.out.println("No");
                System.exit(0);
            }

            do {
                //System.out.println("[" + hitachi + "]");

                if (hitachi.startsWith("hi")) {
                    //hitachi = hitachi.substring(2, hitachi.length() - 1);
                    hitachi = hitachi.substring(2);
                    //System.out.println("substring = [" + hitachi + "]");
                } else {
                    System.out.println("No");
                    System.exit(0);
                }
            } while (hitachi.length() > 0);
            System.out.println("Yes");
        //}
    }

}
