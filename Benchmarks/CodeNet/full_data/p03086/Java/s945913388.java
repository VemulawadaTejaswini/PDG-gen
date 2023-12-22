import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sList = s.split("[^(ACGT)]", 0);

        if (sList.length != 0) {
            int[] iList = new int[sList.length];

            for (int i = 0; i < sList.length; i++) {
                iList[i] = sList[i].length();
            }
            Arrays.sort(iList);


            System.out.println(iList[iList.length - 1]);
        } else {
            System.out.println(0);
        }

    }
}