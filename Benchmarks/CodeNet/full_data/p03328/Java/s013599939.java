

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int a=scanner.nextInt();
        final int b=scanner.nextInt();
        System.out.println(func(b-a-1)-a);

    }
    public static long func(int i){
        if(i==0){
            return 0;
        }
        return i+func(i-1);
    }
}
