import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        int[] v = new int[a];
        int[] c = new int[a];
        
        for(int i = 0; i < a; i++){
            v[i] = sc.nextInt();
        }
        
        for(int j = 0; j < a; j++){
            c[j] = sc.nextInt();
        }
        
        int result = 0;
        for(int k = 0; k < a; k++){
            int g = v[k] - c[k];
            if(g > 0){
                result += g;
            }
        }
        
        System.out.println(result);
    }
}