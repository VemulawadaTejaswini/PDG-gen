import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = sc.nextInt();
    
    int n = 1;
    while(X >= n*Y + (n+1)*Z){
        n++;
    }
	System.out.println(n-1);
      }
}
