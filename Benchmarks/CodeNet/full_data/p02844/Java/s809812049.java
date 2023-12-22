import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String str = sc.next();
        
        int index = 0;
        int count = 0;
        for (int i = 0; i <= 9; i++) {
            
            for (int x = 0; x < n; x++) {
                if (Integer.parseInt(String.valueOf(str.charAt(x))) == i) {
                    
                    for (int j = 0; j <= 9; j++) {
                        
                        for (int y = x + 1; y < n; y++) {
                            if (Integer.parseInt(String.valueOf(str.charAt(y))) == j) {
                                
                                for (int k = 0; k <= 9; k++) {
                                    
                                    for (int z = y + 1; z < n; z++) {
                                        if (Integer.parseInt(String.valueOf(str.charAt(z))) == k) {
                                            count++;
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
