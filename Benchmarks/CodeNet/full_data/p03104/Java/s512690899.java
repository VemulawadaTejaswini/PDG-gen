import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long a = Long.parseLong(scanner.next());
        long b = Long.parseLong(scanner.next());
        scanner.close();
        long count = 0;
        for(long l = a;l <= b ; l++){
            count ^= l;
        }

        System.out.println(count);
    }
}
