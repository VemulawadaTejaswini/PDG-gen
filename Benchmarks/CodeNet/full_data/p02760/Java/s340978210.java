import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int n = 9;
        int[] arr = new int[9];
        for (int i=0; i<9; i++) arr[i] = sc.nextInt();

        int n = sc.nextInt();

        int[] bingo = new int[9];

        for (int i=0; i<n; i++){
            int b = sc.nextInt();
            for (int j=0; j<9; j++){
                if (arr[j]==b) {
                    bingo[j] = 1;
                }
            }
        }

        if (bingo[0]==1 && bingo[3]==1 && bingo[6]==1){
            System.out.println("Yes");
            return;
        }else if (bingo[1]==1 && bingo[4]==1 && bingo[7]==1){
            System.out.println("Yes");
            return;
        }else if (bingo[2]==1 && bingo[5]==1 && bingo[8]==1){
            System.out.println("Yes");
            return;
        }else if (bingo[0]==1 && bingo[1]==1 && bingo[2]==1){
            System.out.println("Yes");
            return;
        }else if (bingo[3]==1 && bingo[4]==1 && bingo[5]==1){
            System.out.println("Yes");
            return;
        }else if (bingo[6]==1 && bingo[7]==1 && bingo[8]==1){
            System.out.println("Yes");
            return;
        }else if (bingo[0]==1 && bingo[4]==1 && bingo[8]==1){
            System.out.println("Yes");
            return;
        }else if (bingo[2]==1 && bingo[4]==1 && bingo[6]==1){
            System.out.println("Yes");
            return;
        }



        System.out.println("No");

    }
}
