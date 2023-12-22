import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left  = sc.nextInt()+sc.nextInt();
        int right = sc.nextInt()+sc.nextInt();
        if (left>right){
            System.out.println("Left");
        }else if(left==right){
            System.out.println("Balanced");
        }else {
            System.out.println("Right");
        }
    }
}
