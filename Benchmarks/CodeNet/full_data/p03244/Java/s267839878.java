import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] v = new int[n];
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0; i<n; i++){
            v[i] = sc.nextInt();
            if(i%2==0){
                list2.add(v[i]);
            }
            else{
                list1.add(v[i]);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);

        int max1 = 0;
        int m1 = 0;
        int a = 0;
        int x = 1;
        for(int i=1; i<list1.size(); i++){
            if(list1.get(i)==list1.get(i-1)){
                x++;
            }
            else{
                int max = Math.max(max1, x);
                if(max!=max1){
                    m1 = max1;
                    max1 = max;
                    a = list1.get(i-1);
                }
                x = 1;
            }
        }
        int max = Math.max(max1, x);
        if(max!=max1){
            m1 = max1;
            max1 = max;
            a = list1.get(list1.size()-1);
        }
        int max2 = 0;
        int m2 = 0;
        int b = 0;
        int y = 1;
        for(int i=1; i<list2.size(); i++){
            if(list2.get(i)==list2.get(i-1)){
                y++;
            }
            else{
                int m = Math.max(max2, y);
                if(m!=max2){
                    m2 = max2;
                    max2 = m;
                    b = list2.get(i-1);
                }
                y = 1;
            }
        }
        int m = Math.max(max2, y);
        if(m!=max2){
            m2 = max2;
            max2 = m;
            b = list2.get(list2.size() - 2);
        }
        if(b!=a){
            System.out.println(n - max1 - max2);
        }
        else{
            if(max1>=max2){
                System.out.println(n - max1 - m2);
            }
            else{
                System.out.println(n - m1 - max2);
            }
        }
    }
}