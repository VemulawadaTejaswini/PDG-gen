import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        double hen = l / 3;
        System.out.println(hen * hen * hen);
//        if (l % 3 == 0) {
//            System.out.println(((double)hen) * hen * hen);
//        } else if(l % 3 == 1) {
//            System.out.println((double)(hen + 1) * hen * hen);
//        } else{
//            System.out.println((double)(hen + 1) * (hen+1) * hen);
//        }
    }
}