import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] strArray = line.split(" ");
        int A = Integer.parseInt(strArray[0]);
        int B = Integer.parseInt(strArray[1]);
        int C = Integer.parseInt(strArray[2]);
        
        int capacity = A - B;
        int result = (C > capacity) ? C - capacity : 0;
        
        System.out.println(result);
    }



}