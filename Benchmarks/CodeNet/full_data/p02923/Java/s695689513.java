import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = Integer.parseInt(sc.next());
        }
        
        int max = 0;
        int count = 0;
        for(int i = 0; i < n-1; i++){
            if(h[i] >= h[i+1]){
                count++;
            }else{
                if(count > max){
                    max = count;
                }
                count = 0;
            }
        }
        if(count > max){
            max = count;
        }
        
        System.out.println(max);
    }
}