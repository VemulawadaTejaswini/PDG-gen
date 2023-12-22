package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        List<Integer> v1=new ArrayList<>();
        List<Integer> v2=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0){
                v1.add(scanner.nextInt());
            }else{
                v2.add(scanner.nextInt());
            }
        }

        FixedPair vfp1=func(v1);
        FixedPair vfp2=func(v2);
        if(vfp1.y!=vfp2.y){
            System.out.println(n-vfp1.x-vfp2.x);
        }else{
            if(vfp1.x>vfp2.x){
                v2=v2.stream().filter(x->x!=vfp2.y).collect(Collectors.toList());
            }else{
                v1=v1.stream().filter(x->x!=vfp1.y).collect(Collectors.toList());
            }
            if(v1.size()==0||v2.size()==0){
                System.out.println(n/2);
            }else{
                System.out.println(n-Arrays.asList(func(v1),func(v2)).stream().mapToLong(x->x.x).sum());
            }
        }
    }
    public static FixedPair func(List<Integer> list){
        int[] count=new int[10001];
        for(int x:list){
            count[x]++;
        }
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<count.length;i++){
            if(max<count[i]){
                max=count[i];
                index=i;
            }
        }
        return new FixedPair(max,index);
    }
    static class FixedPair{
        final long x,y;
        public FixedPair(long x,long y){
            this.x=x;
            this.y=y;
        }
    }
}
