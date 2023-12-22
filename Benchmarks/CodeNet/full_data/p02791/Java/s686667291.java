import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        int min = Integer.parseInt(sc.next());
        int count = 1;
        for(int i = 1; i < n; i++){
            int p = Integer.parseInt(sc.next());
            if(p <= min){
                count++;
                min = p;
            }
        }
        
        System.out.println(count);
    }
}