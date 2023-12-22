import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tmp = new int[n];
        
        for(int i=0; i<n-1; i++){
            int j = sc.nextInt();
            tmp[j-1]++;
        }
        
        for(int i : tmp){
            System.out.println(i);
        }
    }
}