import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] anslist = new long[M];
        long maxNum = N * (N-1) / 2;
        int groupNum=0;
        int[] islandGroup = new int[N+1];
        int[] groupCount= new int[N+1];
        long canReach=0;
        for (int i=0;i<N+1;i++){
            islandGroup[i] = 0;
            groupCount[i] =0;
        }

        int[] A = new int[M];
        int[] B = new int[M];
        for(int i=0;i<M;i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            anslist[i] = maxNum;
        }



        for(int i=M-1;i >= 0;i--){
            anslist[i] = maxNum - canReach;

            if(islandGroup[A[i]] == 0 && islandGroup[B[i]] == 0){
                groupNum++;
                islandGroup[A[i]] = groupNum;
                islandGroup[B[i]] = groupNum;
                groupCount[groupNum] =2;
                canReach += 1;
            } else if(islandGroup[A[i]] == islandGroup[B[i]]){

            } else if(islandGroup[A[i]] != 0 && islandGroup[B[i]] != 0){
                canReach += (groupCount[islandGroup[A[i]]] * groupCount[islandGroup[B[i]]]);
                groupCount[A[i]] += groupCount[B[i]];
                groupCount[B[i]] = 0;
                for(int j=0;j<N;j++){
                    if(islandGroup[j] == islandGroup[B[i]]){
                        islandGroup[j] = islandGroup[A[i]];
                    }
                }

            } else {
                if(islandGroup[A[i]] == 0){
                    islandGroup[A[i]] = islandGroup[B[i]];
                    canReach += groupCount[islandGroup[A[i]]];
                    groupCount[islandGroup[A[i]]]++;
                } else {
                    islandGroup[B[i]] = islandGroup[A[i]];
                    canReach += groupCount[islandGroup[B[i]]];
                    groupCount[islandGroup[B[i]]]++;
                }
            }


        }


        for(int i=0;i<M;i++){
            System.out.println(anslist[i]);
        }


    }


}
