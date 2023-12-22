import java.util.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int[] a = new int[N];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            for(int j=0; j<a[i]; j++){
                list.add(i + 1);
            }
        }
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                if(i%2==0){
                    if(j==W-1){
                        System.out.println(list.get(i * W + j));
                    }
                    else{
                        System.out.print(list.get(i * W + j) + " ");
                    }
                }
                else{
                    if(j==W-1){
                        System.out.println(list.get(i * W + W - 1 - j));
                    }
                    else{
                        System.out.print(list.get(i * W + W - 1 - j) + " ");
                    }
                }
            }
        }
    }
}