import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        int val = Integer.parseInt(str);
        String moji = sc.nextLine();
        sc.close();

        if(val >= 3200){
            System.out.println(moji);
        }else{
            System.out.println("red");
        }
    }
}