import java.util.*;
class Lucky7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        if (n.indexOf("7") < 0) {
            System.out.println("No");
        } else
        {
            System.out.println("Yes");
        }
    }
}
