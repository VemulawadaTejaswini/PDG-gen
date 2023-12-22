import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String blank = sc.nextLine();
        String s = sc.nextLine();
        sc.close();

        int pos = 0;
        List<Integer> arrayOne = new ArrayList<Integer>();
        List<Integer> arrayZero = new ArrayList<Integer>();
        while (pos < n) {
            int countOne = 0;
            int countZero = 0;
            while (s.charAt(pos) == '1') {
                countOne++;
                if (pos != n - 1) {
                    pos++;
                } else {
                    break;
                }
            }
            while (s.charAt(pos) == '0') {
                countZero++;
                if (pos != n - 1){
                    pos++;
                } else {
                    break;
                }
            }
            arrayOne.add(countOne);
            arrayZero.add(countZero);
            if(pos == n - 1) break;
        }
        

        int oneMax = 0;
        for (int i = 0; i < arrayOne.size(); i++) {
            int countK = k;
            int j = i;
            int maxCandidate = 0;
            while (j < arrayOne.size()) {
                maxCandidate += arrayOne.get(j);
                if (arrayZero.get(j) != 0) {
                    if (countK != 0) {
                        countK --;
                        maxCandidate += arrayZero.get(j);
                    } else {
                        break;
                    }
                }
                j++;
            }
            if(maxCandidate > oneMax){
                oneMax = maxCandidate;
            }
        }
        System.out.println(oneMax);
    }
}
