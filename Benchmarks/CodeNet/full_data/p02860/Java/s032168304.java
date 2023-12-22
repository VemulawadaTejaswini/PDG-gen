import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input11 = sc.nextLine();
        String input2 = sc.nextLine();
        int input1 = Integer.parseInt(input11);

        String 前半 = input2.substring(0, input1/2-1);
        String 後半 = input2.substring(input1/2, input1-1);
        
        if (Integer.parseInt(input1) == input2.length() && 前半.equals(後半)) {
                System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
