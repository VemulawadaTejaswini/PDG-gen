import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer [] num = new Integer[3];
        for (int i = 0; i < 3; i ++) {
        	num[i] = sc.nextInt();
        }
        Arrays.sort(num, Comparator.reverseOrder()); 
        int n = Integer.parseInt(String.valueOf(num[0])+String.valueOf(num[1]))+num[2];
        System.out.println(n);
    }
}