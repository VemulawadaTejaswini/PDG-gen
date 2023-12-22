import java.util.*;

class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        
        int counter = 0;
        
        for(int i = 0; i < n - 2; ++i) {
            if((s.charAt(i) == 'A') && (s.charAt(i+1) == 'B') && (s.charAt(i+2) == 'C')) {
                ++counter;
            }
            else continue;
        }
        
        System.out.println(counter);

    }
}