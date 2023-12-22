import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n];
        int counter=0;
        for(int i = 0; i < n ; i++){
            h[i] = scan.nextInt();
        }
        for(int j = 0; j < n - 1; j++){
            if(h[j] > h[j+1] + 1){
                System.out.print("No");
                break;
            }
            else{
                counter++;
            }
        }
        if(counter== n){
            System.out.print("Yes");
        }
    }
}