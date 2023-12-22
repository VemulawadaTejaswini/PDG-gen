package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> brokens = new ArrayList<>();
        for(int i=0; i < M; i++){
            brokens.add(sc.nextInt());
        }

        List<Integer> ans = new ArrayList<>();
        if(brokens.contains(1) && brokens.contains(2)){
            ans.add(0);
            ans.add(0);
        }else if(brokens.contains(1)){
            ans.add(0);
            ans.add(1);
        }else if(brokens.contains(2)){
            ans.add(1);
            ans.add(0);
        }else {
            ans.add(1);
            ans.add(2);
        }
        for(int i=2; i<N; i++){
            if(brokens.contains(i) && brokens.contains(i-1)){
                ans.add(0);
            }else if (brokens.contains(i)){
                ans.add(ans.get(i-2));
            }else if (brokens.contains(i-1)){
                ans.add(ans.get(i-1));
            }else {
                ans.add(
                        ans.get(i-1)+ans.get(i-2)
                );
            }
            ans.set(i,ans.get(i)%1000000007);
        }
        //for (Integer list:ans){
        //    System.out.println(list);
        //}
        System.out.println(ans.get(i-1));
    }
}
