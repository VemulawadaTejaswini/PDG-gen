import java.util.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        int[] lower = {1, 400, 800, 1200, 1600, 2000, 2400, 2800};
        int[] upper = {399, 799, 1199, 1599, 1999, 2399, 2799, 3199};
        String[] s = {"G", "B", "G", "W", "B", "Y", "O", "R", "N"};
        ArrayList<String> list = new ArrayList<String>();
        int x = 0;

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            for(int j=0; j<8; j++){
                if(a[i]>=lower[j] && a[i]<=upper[j]){
                    if(!list.contains(s[j])){
                        list.add(s[j]);
                    }
                    break;
                }
                if(j==7){
                    x += 1;
                }
            }
        }
        int min;
        if(list.size()>=1){
            min = list.size();
        }
        else{
            min = 1;
        }
        int max;
        if(list.size()+x<=8){
            max = list.size() + x;
        }
        else{
            max = 8;
        }
        System.out.println(min + " " + max);
    }
}