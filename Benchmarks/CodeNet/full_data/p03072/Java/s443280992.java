import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt();
        int total = 1;
        for(int i = 0; i < n - 1; i++){
            int tmp = sc.nextInt();
            if(max <= tmp){
                max = tmp;
                total++;
            }
        }
        System.out.println(total);
        
    }
}
