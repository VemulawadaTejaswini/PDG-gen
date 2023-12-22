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
        for(int i = N; i<= 10000; i++ ){
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

    }
}