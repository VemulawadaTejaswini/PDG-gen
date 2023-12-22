public class Main {

    public static void main(String[] args) {


        if (args == null) System.exit(0);


        if (args.length > 0 && args.length < 10) {
            System.out.println("No");
            System.exit(0);
        } else {
            String hitachi = args[0];
            do {
                //System.out.println(hitachi);
                if (hitachi.startsWith("hi")) {
                    hitachi = hitachi.substring(2);
                } else {
                    System.out.println("No");
                    System.exit(0);
                }
            } while (hitachi.length() > 0);
            System.out.println("Yes");

        }
    }
}