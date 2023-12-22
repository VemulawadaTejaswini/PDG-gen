import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        int socket = 1;
        int count = 0;
        while(socket < b){
            socket += a-1;
            count++;
        }
        
        System.out.println(count);
    }
}