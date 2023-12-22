    import java.util.*;
    
    public class Main {
        public static void main(String...args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Long ans = 0L;
            List<Long> lst = new ArrayList<>();
            for (Long i = n + 0L; i > 0; i--){
                ans += i - 1;
            }
            System.out.println(ans);
        }
    }
