import java.util.Scanner;  
  
public class Main {  
  
    public static void main(String[] args) {  
        Scanner in = new Scanner(System.in);  
        while (in.hasNextInt()) {  
            int a = in.nextInt();  
            int b = in.nextInt();  
            int c = in.nextInt();  
            System.out.println(test(a,b,c));  
        }  
    }  
      
    public static int test(int a, int b,int c) {  
        int result = 0;  
        // write code here  
        for(int i = a;i<=b;i++)  
        {  
            if(i%c==0){  
                result+=1;  
            }  
        }  
        return result;        
    }  
}  