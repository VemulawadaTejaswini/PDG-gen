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
            if(h == 1){
                for(int i=0; i<w; i++){
                    System.out.print(i%2);
                }
                System.out.println();
            }else if(w == 1){
                for(int i=0; i<h; i++){
                    System.out.println(i%2);
                }
            }else if(h == w){
                int[] x = new int[w];
                for(int i=0; i<w; i++){
                    x[i] = i%2;
                }
                
                for(int i=0; i<h; i++){
                    for(int j=0; j<w; j++){
                        System.out.print(x[(i+j)%w]);
                    }
                    System.out.println("");
                }
            }else{
                System.out.println("No");
            }
        }
        
    }
    
}