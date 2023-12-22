import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input
        // N
        // A1,1 A1,2 ... A1,N-1
        // A2,1 A2,2 ... A2,N-1
        // :    :    ... :
        // AN,1 AN,2 ... AN,N-1
        // 選手 1,2,...,N のそれぞれについて
        // 選手 i が Ai,1 Ai,2 ... Ai,N-1 の順で試合をする時
        // 最小の試合日数を出力せよ (ただし試合が組めない場合は -1 を出力せよ)
        Scanner sc = new Scanner(System.in);
        LinkedList<LinkedList<Integer>> listLeague = new LinkedList<LinkedList<Integer>>();
        int numPlayer = sc.nextInt();
        for(int i = 0; i < numPlayer; i++){
            LinkedList<Integer> listVersus = new LinkedList<>();
            for(int j = 1; j < numPlayer; j++){
                listVersus.add(sc.nextInt());
            }
            listLeague.add(listVersus);
        }
        int numDay = 0;
        int retNum = 0;
        boolean isContinueLeague = true;
        boolean isPlayedGame;
        while(isContinueLeague){
            numDay++;
            isPlayedGame = false;
            for(int i = 0; i < numPlayer; i++){
                int nextGamePlayer = listLeague.get(i).element();
                if(i + 1 < nextGamePlayer && listLeague.get(nextGamePlayer - 1).element() == i + 1){
                    isPlayedGame = true;
                    listLeague.get(i).remove();
                    listLeague.get(nextGamePlayer).remove();
                }
            }
            if(isPlayedGame == false){
                isContinueLeague = false;
            }
        }
        if(listLeague.isEmpty() == false){
            numDay = -1;
        }
        System.out.println(numDay);
    }
}
