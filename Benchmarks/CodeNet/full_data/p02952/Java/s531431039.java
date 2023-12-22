import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        String asStringN = String.valueOf(n);
        int length = asStringN.length();
        int sum = 0;
        for(int k = 1; k < length;k=k+2) {
          sum += 9*Math.pow(10,k-1);
        }
        if(length % 2 != 0) {
          sum += n-Math.pow(10, length-1) + 1;
        }
        
        System.out.println(sum);
    }
}