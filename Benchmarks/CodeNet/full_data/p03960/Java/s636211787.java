

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int total = 0;
        List<String>[] matrix = new List[W];
        for(int i=0;i<W;i++){
            List<String> l = new LinkedList<>();
            matrix[i] = l;
        }

        for(int i=0;i<H;i++){
            String in = sc.next();
            for(int j=0;j<W;j++){
               matrix[j].add(in.charAt(j)+"");
            }
        }

        for(int k=0;k<W*H;k++){
            int min_cost =2*H;
            int target=-1;
            for(int i=0;i<W;i++){
                if(matrix[i].size()!=0){
                    int tmp = calFutureCost(matrix,i);
                    if(tmp<min_cost) {
                        min_cost = tmp;
                        target =i;
                    }
                }
            }
            total += calCurrent(matrix,target);
            //System.out.println("debug:" + target + ", " + total);
            matrix[target].remove(0);
        }

        System.out.println(total);

    }

    private static int calFutureCost(List<String>[]  matrix, int idx){
        int cost =0;

        for(int i=1;i<matrix[idx].size();i++){
            //left
            if(idx>0) {
                if(i-1<matrix[idx-1].size()) {
                    if (matrix[idx].get(i).equals( matrix[idx-1].get(i-1))){
                        cost++;
                    }
                }
            }
            if(idx<matrix.length-1){
                if(i-1<matrix[idx+1].size()) {
                    if (matrix[idx].get(i).equals(matrix[idx+1].get(i-1))){
                        cost++;
                    }
                }
            }
        }
        return cost;
    }

    private static int calCurrent(List<String>[]  matrix, int idx){
        int cost =0;

        for(int i=0;i<matrix[idx].size();i++){
            //left
            if(idx>0) {
                if(i<matrix[idx-1].size()) {
                    if (matrix[idx].get(i).equals(matrix[idx-1].get(i))){
                        cost++;
                    }
                }
            }
            if(idx<matrix.length-1){
                if(i<matrix[idx+1].size()) {
                    if (matrix[idx].get(i).equals( matrix[idx+1].get(i))){
                        cost++;
                    }
                }
            }
        }
        return cost;
    }

 }
