import java.util.Scanner;

public class Main {
    
    private static final String GOOD = "Good";
    private static final String BAD = "Bad";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(isGood(S)?GOOD:BAD);
    }

    private static boolean isGood(String target) {
        boolean result = true;
        char[] partitioned = target.toCharArray();
        
        for(int i=1;i<partitioned.length;i++) {
            if(partitioned[i-1]==partitioned[i]) {
                result = false;
            }
        }
        return result;
    }
}