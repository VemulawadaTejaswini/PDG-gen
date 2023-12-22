import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        int sum = n4;
        int[] coins = {n1,n2,n3};
        int[][] arr = new int[n4+1][coins.length];

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(coins[j] == 1){
                    arr[i][j] = arr[i-1][j]+1;
                }
                else if(i==1 && coins[j] <= sum){
                    arr[i][j] = 1;
                }
                else if(coins[j]*i <= sum){
                    arr[i][j] = i;
                }
            }
        }

        Set<String> set = new HashSet<>();
        ways(arr,coins,sum,set);

        for(String s: set)
            System.out.println(s);

    }

    static void ways(int[][] arr, int[] coins, int sum, Set<String> set){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=0;k<arr.length;k++){
                    if((arr[i][0]*coins[0] + arr[j][1]*coins[1] + arr[k][2]*coins[2]) == sum){
                        String str = "(" + arr[i][0] + "," + arr[j][1] + "," + arr[k][2] + ")";
                        set.add(str);
                    }
                }
            }
        }
    }

//    static void printArray(int[][] arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.println();
//            for(int j=0;j<arr[0].length;j++){
//                System.out.print(arr[i][j]);
//            }
//        }
//    }
}