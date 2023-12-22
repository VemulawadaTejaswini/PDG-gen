import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        int S = sc.nextInt(); 
        int count = 0;
        
        for(int X = 0; X <= K; X++){
            for(int Y = 0; Y <= X; Y++){
                int Z = S - X - Y;
                if(Z >= 0 && Z <= Y){
                    
                    //X,Y,Zがすべて等しいとき
                    if(X == Y && X == Z){
                        count++;
                        break;
                    
                    //X,Y,Zのうち2個が等しいとき
                    }else if((X == Y && X != Z) || (X == Z && X != Y) || (Y == Z && X != Z)){
                        count += 3;
                        break;
                    
                    //X,Y,Zがすべて異なるとき
                    }else{
                        count += 6;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
