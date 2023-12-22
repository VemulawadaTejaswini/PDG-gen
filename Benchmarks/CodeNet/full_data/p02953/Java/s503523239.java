import java.util.*;

public class Main {
    public static void main(String args[]) {
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    int d[] = new int[n];
    d[0] = read.nextInt()-1;
    boolean ban=true;
    for(int i=1; i<n; i++){
        d[i]=read.nextInt();
        if(d[i-1] > d[i]){
            ban=false;
            break;
        }
        if(d[i-1] < d[i])
            --d[i];
    }
    
        if(ban)
           System.out.println("Yes");
        else
           System.out.println("No");
    
    
    
   
    }
}