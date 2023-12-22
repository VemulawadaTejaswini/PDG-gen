import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a == b){
            System.out.println(result(a,b));
        }else {
            String tmpA = result(a,b);
            String tmpB = result(b,a);

            if (tmpA.compareTo(tmpB) == -1){
                System.out.println(tmpA);
            }else {
                System.out.println(tmpB);
            }
        }
    }

    public static String result(int a, int b){
        String result ="";
        for (int i = 0; i < b; i++){
            result += Integer.toString(a);
        }
        return result;
    }
}
