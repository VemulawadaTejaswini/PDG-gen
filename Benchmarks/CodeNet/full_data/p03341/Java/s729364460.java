import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();

        int min = 0;
        for(int i=1; i<n; i++){
            if(s.charAt(i) == 'E'){
                min++;
            }
        }

        int c = min;

        for(int i=1; i<n; i++){
            if(s.charAt(i) == 'E') c--;
            if(s.charAt(i-1) == 'W') c++;
            if(c < min) min = c;
        }

        System.out.println(min);
    }
}