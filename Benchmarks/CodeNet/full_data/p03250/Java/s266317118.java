import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[3];
        for(int i = 0;i < 3;i ++) list[i] = scanner.nextInt();
        Arrays.sort(list);
        int a = list[0] * 10;
        int b = list[1];
        int c = list[2];
        System.out.println(a + b + c);
    }
}