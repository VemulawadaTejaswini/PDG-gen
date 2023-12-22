import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long n2 = sc.nextLong();
        int[] sosu = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        int count = 1;
        for (int i=0;i<sosu.length;i++){
            if(n%sosu[i] == 0 && n2%sosu[i] ==0){
                count++;
            }
        }
        System.out.println(count);



    }
}