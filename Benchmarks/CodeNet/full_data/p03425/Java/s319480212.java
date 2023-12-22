import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = 0;
        long a = 0;
        long r = 0;
        long c = 0;
        long h = 0;
        
        while (n-- > 0) {
            char chr = sc.next().charAt(0);
            
            switch (chr) {
                case 'M':
                    m++;
                    break;
                case 'A':
                    a++;
                    break;
                case 'R':
                    r++;
                    break;
                case 'C':
                    c++;
                    break;
                case 'H':
                    h++;
                    break;
            }
        }
        
        long count = 0;
        count += m * a * r;
        count += m * a * c;
        count += m * a * h;
        count += m * r * c;
        count += m * r * h;
        count += m * c * h;
        count += a * r * c;
        count += a * r * h;
        count += a * c * h;
        count += r * c * h;
        
        System.out.println(count);
    }
}
