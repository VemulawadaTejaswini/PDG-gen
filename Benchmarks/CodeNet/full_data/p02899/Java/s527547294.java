import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] student = new int[n+1];
        
        for(int i=1;i<=n;i++){
            int a= scanner.nextInt();
            student[a]=i;
            
        }
        
        for (int i=1;i<=n;i++){
            System.out.println(student[i]);
        }
        
    }
}