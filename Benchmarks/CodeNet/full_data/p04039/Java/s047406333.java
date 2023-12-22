import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code hereScan
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int array[] = new int[K];
        for(int z = 0; z< array.length; z++){
            array[z] = sc.nextInt();
        }
        for(int i = N; i< 10001; i++ ){
            boolean validMoney = true;
            for(int x = 0; x < array.length; x++){
                if(String.valueOf(i).indexOf(String.valueOf(array[x])) >= 0) {
                    validMoney = false;
                }
            }

            if(validMoney){
                System.out.println(i);
                break;
            }

        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        boolean[] hate = new boolean[10];
//        for(int i=0;i<m;i++) {
//            hate[sc.nextInt()] = true;
//        }
//        LOOP: for(int x=n;;x++) {
//            String s = String.valueOf(x);
//            for(int i=0;i<s.length();i++) {
//                System.out.println(hate[s.charAt(i)-'0']);
//                if (hate[s.charAt(i)-'0']) {
//                    continue LOOP;
//                }
//            }
//            System.out.println(x);
//            return;
//        }

    }
}