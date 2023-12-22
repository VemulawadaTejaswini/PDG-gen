import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int G = sc.nextInt();
        
        int p = 0;
        int c = 0;
        
        int conp = 0;
        
        for(int i=0; i<D; i++){
            p = sc.nextInt();
            c = sc.nextInt();
            
            conp = p * 100 * (i+1) + c;
            
            if(conp >= G){
                System.out.println(p);
                break;
            }
        }
        
    }
}
        
        
        
        
        
        