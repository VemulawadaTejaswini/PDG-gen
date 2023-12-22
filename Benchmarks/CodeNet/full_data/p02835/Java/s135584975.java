import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(execute(sc.nextInt(),sc.nextInt(),sc.nextInt()));

    }

    public static String execute(int a1,int a2,int a3) {

        if(a1 + a2 + a3 <=21){
            return "win";
        }
        return "bust";
    }
}