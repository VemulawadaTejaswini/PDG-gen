import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        //int q = stdIn.nextInt();
        int num[] = new int[n];
        
        for(int i = 0; i < n; i++){
            num[i] = stdIn.nextInt();
        }
        
        Arrays.sort(num);
        
        for(int i = 0; i < m; i++){
            num[n - 1] = num[n - 1] / 2;
            Arrays.sort(num);
        }
        
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += num[i];
        }
        
        System.out.println(sum);
        // for(int i = 0; i < q; i++){
        //     int ans = stdIn.nextInt();
        //     num[ans]++;
        // }
        
        // for(int i = 1; i <= n; i++){
        //     if(num[i] > 0){
        //         System.out.println("Yes");
        //     }else{
        //         System.out.println("No");
        //     }
        // }
        //int c = stdIn.nextInt();
        //String s = stdIn.next();
        //char c[] = s.toCharArray();
        //String ss[] = new int[s.length()];
        
        //boolean flag = true;
        
       //for(int i = 0; i < s.length(); i++){
        //     if(i % 2 == 0){
        //         if(c[i] == 'L'){
        //             flag = false;
        //             break;
        //         }
        //     }else{
        //         if(c[i] == 'R'){
        //             flag = false;
        //             break;
        //         }
        //     }
        // }
        
        // if(flag){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
        
        
        // if(s.equals("Sunny")){
        //     System.out.println("Cloudy");
        // }else if(s.equals("Cloudy")){
        //     System.out.println("Rainy");
        // }else{
        //     System.out.println("Sunny");
        // }
        
        //int count = 0;
        
        //for(int i = 0; i < s.length(); i++){
            //ss[i] = c
        //}
        
        //System.out.println();
    }
    
}
