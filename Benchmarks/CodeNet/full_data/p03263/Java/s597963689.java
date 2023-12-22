import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] a = new int[H][W];
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> listh = new ArrayList<Integer>();
        ArrayList<Integer> listw = new ArrayList<Integer>();

        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                a[i][j] = sc.nextInt();
            }
            if(i%2==0){
                for(int j=0; j<W; j++){
                    list.add(a[i][j]);
                    listh.add(i);
                    listw.add(j);
                }
            }
            else{
                for(int j=W-1; j>=0; j--){
                    list.add(a[i][j]);
                    listh.add(i);
                    listw.add(j);
                }
            }
        }
        System.out.println(list);
        int[] x = new int[H * W];
        int[] A = new int[H * W];
        int y = 0;
        if(list.get(0)%2==1){
            x[y] = 0;
            A[0] = list.get(0) - 1;
            A[1] = 1;
            y++;
        }
        for(int i=1; i<list.size(); i++){
            A[i] += list.get(i);
            if(i==list.size()-1){
                break;
            }
            if(A[i]%2==1){
                A[i] -= 1;
                A[i + 1] = 1;
                x[y] = i;
                y++;
            }
        }
        System.out.println(y);
        for(int i=0; i<y; i++){
            int b1 = listh.get(x[i]) + 1;
            int b2 = listw.get(x[i]) + 1;
            int b3 = listh.get(x[i] + 1) + 1;
            int b4 = listw.get(x[i] + 1) + 1;
            System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
        }
    }
}