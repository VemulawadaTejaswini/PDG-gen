import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        if(!(a==w/2 && b==h/2)){
            System.out.println("No");
        }else{
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    System.out.print((i+j)%2);
                }
                System.out.println("");
            }
        }
        
    }
    
}