import java.util.*;
    public class Main {// Main
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            x = x-a;
            while(x>0) {
                     x = (x-b); }
            System.out.println(x);
}
}
