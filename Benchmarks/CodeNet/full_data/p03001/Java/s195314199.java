

import java.util.Scanner;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-06-16
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.print(((h*w)*1.000000)/2 + " ");
        if(w==2*x && h==2*y) {
            System.out.println("1");
        }
        else System.out.println("0");
    }

}
