import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int x = sc.nextInt();
            int sum = 0;
            int count = 1;
            for(int i=0; i<num; i++){
                sum += sc.nextInt();
                if(sum <= x) count++;
            }
            System.out.println(count);
        }
    }