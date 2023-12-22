import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] dat = scan.nextLine().split(" ");
        scan.close();
        Arrays.sort(dat);
        System.out.println(Integer.parseInt(dat[0]) + Integer.parseInt(dat[1]));
    }
}
