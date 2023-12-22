import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;
import
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numId = sc.nextInt();
        int numGate = sc.nextInt();

        Integer[] card = new Integer[numId];
        Integer[] ansList = new Integer[numId];

        for (int i = 0; i < numId; i++) {
            int cardNum = sc.nextInt();
            card[i] = cardNum;
        }

        int count=0;
        for (int j = 0; j < card.length/2; j++) {
            for(int k =0; k < card.length; k++) {
                if (card[k] >= card[2*j] || card[k] == card[2*j + 1] ) {
                    ansList[k] += 1;
                }
            }
        }
        for(int l=0; l < card.length; l ++){
            if(ansList[l]== numGate){
                count ++;
            }
        }
        System.out.println(count);
    }
}