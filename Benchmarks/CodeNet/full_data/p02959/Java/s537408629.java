import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        int b[] = new int[n + 1];
        int c = 0; //倒した数
        
        for(int i = 0; i < n + 1; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            
            if(a[i] >= b[i]){
                c += b[i];
            }else{
                b[i] = b[i] - a[i];
                c += a[i];
              
                if(b[i] > a[i+1]){
                    c += a[i + 1];
                    a[i+1] = 0;
                }else{
                    c += b[i];
                    a[i + 1] = a[i + 1] - b[i];
                }
            }
        }
     System.out.println(c);
        
    }
}