import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt() % 2019;
        int r = scanner.nextInt() % 2019;
        int min = Integer.MAX_VALUE;

        System.out.println(l*(l+1)%2019);
    }
}

