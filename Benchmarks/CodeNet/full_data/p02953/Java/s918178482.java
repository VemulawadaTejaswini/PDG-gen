import java.util.*;
 
class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] h = new int[n];
        Arrays.setAll(h, i -> stdIn.nextInt());
        if(n==1){
            System.out.println("Yes");
            return;
        }
        for(int i = 0; i + 1 < n; i++){
            if(h[i+1]-h[i] >= 2){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}