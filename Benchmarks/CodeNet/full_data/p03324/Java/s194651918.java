import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        double n = sc.nextInt();

        double tmp = Math.pow(100, d);
        double ans = 0;

        if(n == 100){
            ans = tmp * 101;
        } else {
            ans = tmp * n;
        }

        System.out.println((int)ans);


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        for(int i=0; i<n; i++){
//            array[i] = sc.nextInt();
//        }

//        System.out.println(search(array, 0));
//
    }
//    public static int search(int[] array, int count){
//        int tmpCount = 0;
//        int tmpTwo = 0;
//        int tmpTwoIndex = -1;
//        for(int i=0; i<array.length; i++){
//            if (array[i] % 2 == 0){
//                if(array[i]>tmpTwo){
//                    tmpTwo = array[i];
//                    tmpTwoIndex = i;
//                }
//                tmpCount++;
//            }
//        }
//        if(tmpCount == 0){
//            return count;
//        } else {
//            for(int j=0; j<array.length; j++){
//                if(j == tmpTwoIndex){
//                    array[j] = array[j] / 2;
//                    count++;
//                } else {
//                    array[j] = array[j] * 3;
//                }
//            }
//            return search(array, count);
//        }
//    }
}
