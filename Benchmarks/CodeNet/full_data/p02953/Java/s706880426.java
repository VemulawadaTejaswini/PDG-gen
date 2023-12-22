import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int mass[] = new int[n];
        
        for(int i = 0; i < n; i++){
           mass[i] = stdIn.nextInt();
        }
        
        boolean flag = true;
        
        for(int i = 0; i < n - 1; i++){
           if(mass[i] - 1 == mass[i + 1]){
               mass[i]--;
           }else if(mass[i] - 1 > mass[i + 1]){
               flag = false;
               break;
           }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
