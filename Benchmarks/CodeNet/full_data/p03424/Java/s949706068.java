    import java.util.*;
     
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            List<String> s = Arrays.asList(sc.next().split(" "));
     
            if (s.contains("Y")){
                System.out.println("Four");
            } else {
                System.out.println("Three");
            }
        }
    }