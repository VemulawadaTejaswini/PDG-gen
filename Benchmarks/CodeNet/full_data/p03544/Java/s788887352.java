import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int i1,i2;
        long l1 = 1;
        long l2 = 1;
        for (int k = 0;k < i - 2;++k){
            long l3 = l1;
            l1 = l2;
            l2 += l3;
        }
        if(i == 1){
            l1 = 0;
        }
        System.out.println(l1 * 2 + l2);
    }


}