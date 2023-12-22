import java.util.*;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Scanner sc = new Scanner(System.in);
       Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int nvlist[] = new int[N+1];
        
        int maxvalue = 1,cou = 0;
        
        for(int i = 0; i< N ;i ++){
            nvlist[Integer.parseInt(sc.next())] = i;
        }
        int temp=1;
        //nvlist tansaku
        for(int i = 2; i <= N ;i ++){
            if( nvlist[i-1] > nvlist[i] ){
                temp = 1;
            }
            else{
                temp++ ;
            }
            maxvalue = Math.max(maxvalue,temp);
        }
        
        System.out.println(N - maxvalue);
        
        
        
    }
    
}