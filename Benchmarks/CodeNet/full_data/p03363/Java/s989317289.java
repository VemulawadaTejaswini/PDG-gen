import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n=scanner.nextInt(),a[]=new int[n+1];
        System.out.println(IntStream.rangeClosed(0,n).boxed().collect(Collectors.groupingBy(i->a[i]=(i==0?0:a[i-1]+scanner.nextInt()),Collectors.counting())).values().stream().mapToLong(i->i*(i-1)/2).sum());
    }
}