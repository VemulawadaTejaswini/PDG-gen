import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int playerNum = sc.nextInt();
        int point = sc.nextInt();
        int correctCnt = sc.nextInt();

        ArrayList<Integer> playerPoint = new ArrayList<>(playerNum);

        for(int i = 0; i < playerNum; i++) {
            playerPoint.add(i, point);
        }

        for(int i = 0; i < correctCnt; i++) {
            int n = sc.nextInt();

            for(int j = 0; j < playerNum; j++) {
                if(j == n - 1){
                    continue;
                }

                playerPoint.set(j, playerPoint.get(j) - 1);
            }
        }

        ArrayList<String> isOkList = new ArrayList<>(playerNum);
        for(int i = 0; i < playerNum; i++){
            String isOk = "Yes";

            if(playerPoint.get(i) <= 0){
                isOk = "No";
            }
            isOkList.add(i, isOk);
        }

        System.out.println(isOkList.toString());

    }
}