import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int x = stdIn.nextInt();
        int count = 1;
        int position = 0;
        
        while(true){
            int a = stdIn.nextInt();
            position += a;
            
            if(position <= x){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
