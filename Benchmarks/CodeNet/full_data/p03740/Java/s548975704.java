import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long x = sc.nextLong();
        Long y = sc.nextLong();
        sc.close();

        if(Math.abs(x-y) <= 1){
            System.out.println("Brown");
        }else{
            System.out.println("Alice");
        }
    }
}