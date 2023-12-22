import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int list[] = new int[n];
        int sum =0;
        for(int i=0; i< n; i++){
            list[i] = sc.nextInt();
            sum += list[i];
        }
        System.out.println(sum);
        if(sum!=0){
            for(int k =0; k < n;k++ ){
                if(list[k]==1){
                    System.out.println(k+1);
                }
            }
        }
    }
}