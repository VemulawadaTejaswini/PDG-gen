import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]L  = new int [N*2];
 
    int all = 0;
    for(int i=0; i<N*2; i++){
    L[i] = sc.nextInt();
        if(i%2!=0){
        all += L[i]-L[i-1]+1;
        }
    }
    System.out.println(all);
    }
}