import java.util.Scanner;

class Main { 

    static int cal (int a, int b) {
    
        int p = b/a;
        
        int sum = p * (p + 1) / 2; 
        
        int ans = a * sum; 
        
        return ans;
    
    }
    
    
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
        for (int i = 1; i<= t; i++) {
        
            int a = 2;
            int b = sc.nextInt();
            System.out.println(cal(a, b));
        
        }
        
    } 
} 

