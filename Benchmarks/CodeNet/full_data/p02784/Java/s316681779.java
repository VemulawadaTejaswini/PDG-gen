import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int h = Integer.parseInt(scan.next());
        int n = Integer.parseInt(scan.next());
        scan.nextLine();
        List<Integer> aList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for(int a : aList) {
            h-=a;
        }
        if(h > 0) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }
}







//import java.util.*;
//
//public class Main {
//    public static void main(String[] arg) {
//        Scanner scan = new Scanner(System.in);
//        int h = Integer.parseInt(scan.next());
//        int a = Integer.parseInt(scan.next());
//
//        int count = 0;
//        while(h > 0) {
//            h = h-a;
//            count++;
//        }
//
//        System.out.println(count);
//    }
//}