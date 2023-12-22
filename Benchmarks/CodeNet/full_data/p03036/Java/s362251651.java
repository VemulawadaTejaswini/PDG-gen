import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        int c = Integer.parseInt(line1[2]);
        for(int i = 0; i < 10; i++){
            System.out.println(a * c - b);
            c = a * c - b;
        }
    }
}