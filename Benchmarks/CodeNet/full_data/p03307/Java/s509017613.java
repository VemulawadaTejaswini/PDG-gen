import java.util.Scanner;

class Main { 

    static int cal (int a, int b) {
    
        int sum = b * (b + 1) / 2; 
        
        //int ans = a * sum; 
        
        return sum;
    
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