import java.util.Scanner;
public class Main{
    
    public static void main (String[ ]args){
        
        Main main = new Main ();
        main.solve();
    }
    
    private void solve (){
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        int[] list = new int[N];
        
        for (int index=0; index<N; index++){
           list[index]=sc.nextInt(); 
        }
        
        int highest = 0;
        int count = 0;
        
        for (int index=0; index<N; index++){
            int height = list[index];
            if (height>=highest){
                count++;
                highest=height;
            }
        }
        
        System.out.println(count);
        
    }
}