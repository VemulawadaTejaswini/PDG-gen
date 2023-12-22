import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] id = new int[M];
        int[] P = new int[M];
        int[] X = new int[N+1];
        int[] Y = new int[M];
        int[] score = new int[M];
        for(int i = 0;i < M;i++){
            id[i] = i;
            P[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        heapsort(Y, id, P, M);
        for(int i = 0;i < M;i++){
            X[P[i]]++;
            score[i] = P[i]*110000+X[P[i]];
        }
        heapsort(id, score, Y, M);
        for(int i = 0;i < M;i++){
            System.out.println(cal(score[i]/110000)+cal(score[i]%110000));
        }
    }
    public static String cal(int a){
        String s = Integer.toString(a);
        int l = s.length();
        for(int i = 0;i+l < 6;i++){
            s = "0"+s;
        }
        return s;
    }
    // public static void heapsort(int[] list, int length){
    // public static void heapsort(int[] list, int[] list2, int length){
    public static void heapsort(int[] list, int[] list2, int[] list3, int length){
            /**
             * make a heaptree
             */
            for(int i = 0;i < length;i++){
                int id = i;
                while(true){
                    if(id == 0) break;
                    int nextid = 0;
                    if(id%2 == 1)   nextid = id/2;
                    else    nextid = id/2-1;
                    if(list[id] > list[nextid]){
                        int tmp = list[id];    list[id] = list[nextid];    list[nextid] = tmp;
                        int tmp2 = list2[id];    list2[id] = list2[nextid];    list2[nextid] = tmp2;
                        int tmp3 = list3[id];    list3[id] = list3[nextid];    list3[nextid] = tmp3;
                    }else{
                        break;
                    }
                    id = nextid;
                }
            }
            /**
             * convert from heaptree to sortlist
             */
            int id2 = length-1;
            while(true){
                if(id2 == 0)    break;
                int tmp = list[0];    list[0] = list[id2];    list[id2] = tmp;
                int tmp2 = list2[0];    list2[0] = list2[id2];    list2[id2] = tmp2;
                int tmp3 = list3[0];    list3[0] = list3[id2];    list3[id2] = tmp3;
                int curid = 0;
                id2--;
                if(id2 == 0)    break;
                while(true){
                    int left = (curid+1)*2-1;
                    int rightnum = Integer.MIN_VALUE;
                    int right = (curid+1)*2;
                    if(right <= id2)    rightnum = list[right];
                    int mid = 0;
                    if(list[left] >= rightnum)  mid = left;
                    else    mid = right;
                    if(list[curid] < list[mid]){
                        int tmpp = list[curid];     list[curid] = list[mid];       list[mid] = tmpp;
                        int tmpp2 = list2[curid];     list2[curid] = list2[mid];       list2[mid] = tmpp2;
                        int tmpp3 = list3[curid];     list3[curid] = list3[mid];       list3[mid] = tmpp3;
                    }else{
                        break;
                    }
                    curid = mid;
                    if((curid+1)*2-1 > id2)   break;
                }
            }
        }
}