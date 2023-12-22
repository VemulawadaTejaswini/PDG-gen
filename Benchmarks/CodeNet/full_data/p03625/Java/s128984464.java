import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            list.add(A[i]);
        }
        Collections.sort(list);
        
        int ans = 1;
        int x = 1;
        int y = 0;

        for(int i=N-2; i>=0; i--){
            if(list.get(i)==list.get(i+1)){
                x++;
            }
            else{
                if(x>=4 && y==0){
                    ans *= list.get(i + 1) * list.get(i + 1);
                    break;
                }
                else if(x>=2){
                    ans *= list.get(i + 1);
                    y += 1;
                    if(y==2){
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}