import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int p[] = new int[n];
        int hikaku[] = new int[n];
        
        for(int i = 0; i < n; i++){
            p[i] = stdIn.nextInt();
            hikaku[i] = p[i];
        }
        
        Arrays.sort(hikaku);
        int count = 0;
        
        for(int i = 0; i < n; i++){
            if(hikaku[i] != p[i]){
                count++;
            }
            

        }
        
        if(count <= 2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
