import java.util.Scanner;

public class A {
    public static void main(String[] at){
        Scanner scanner = new Scanner(System.in);
        int mon = scanner.nextInt();
        String[] hate = new String [scanner.nextInt()];
        for (int i = 0; i < hate.length; i++){
            hate[i] = scanner.next();
        }
        String money = Integer.toString(mon);
        int result = mon;
        boolean ok = true;
        while (ok){
            for (int i = 0; i < hate.length; i++){
                if (money.matches(".*" + hate[i] + ".*")){
                    result++;
                    money = Integer.toString(result);
                    break;
                } else if (i == hate.length-1){
                    ok = false;
                }
            }
        }

        System.out.println(result);


    }
}
