import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
 
        int[] A_array = new int[N];
        int[] B_array = new int[N];
        
        for(int i = 0; i < N; i++){
            A_array[i] = sc.nextInt();
            B_array[i] = sc.nextInt();
        }
        
        //安い順に買う
        int num = 0;
        long total = 0;
        int[] min = {1000000000, 0};
        int[] secondmin = {1000000000, 0};
        int[] thirdmin = {1000000000, 0};
        label:while(true){
            for(int i = 0; i < N; i++){
                
                if(A_array[i] < thirdmin[0]){
                    if(A_array[i] < secondmin[0]){
                        if(A_array[i] < min[0]){
                            thirdmin[0] = secondmin[0];
                            secondmin[0] = min[0];
                            thirdmin[1] = secondmin[1];
                            secondmin[1] = min[1];
                            min[0] = A_array[i];
                            min[1] = i;
                        } else{
                            thirdmin[0] = secondmin[0];
                            secondmin[0] = A_array[i];
                            thirdmin[1] = secondmin[1];
                            secondmin[1] = i;
                        }
                    } else{
                        thirdmin[0] = A_array[i];
                        thirdmin[1] = i;
                    }
                }
            }
            
            for(int i = 0; i < B_array[min[1]]; i++){
                num ++;
                total += A_array[min[1]];
                if(num == M){
                    break label;
                }
            }
            for(int i = 0; i < B_array[secondmin[1]]; i++){
                num ++;
                total += A_array[secondmin[1]];
                if(num == M){
                    break label;
                }
            }
            for(int i = 0; i < B_array[thirdmin[1]]; i++){
                num ++;
                total += A_array[thirdmin[1]];
                if(num == M){
                    break label;
                }
            }
            
            
            min[0] = 1000000000;
            secondmin[0] = 1000000000;
            thirdmin[0] = 1000000000;
            A_array[min[1]] = 1000000000;
            A_array[secondmin[1]] = 1000000000;
            A_array[thirdmin[1]] = 1000000000;
        }
        
        System.out.println(total);
        
    }
}