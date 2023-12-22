import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int X = Integer.parseInt(sc.next());
        
        int ans = 1;
        for(int i=1; i<X; i++){
            for(int j=2; j<X; j++){
                int a = (int)Math.pow(i, j);
                if(a < X){
                    if(ans < a){
                        ans = a;
                    }
                }else{
                    break;
                }
            }
        }
        
        System.out.println(ans);
    }
}