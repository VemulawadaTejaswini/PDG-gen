import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<n; i++){
            list.add(Integer.parseInt(sc.next()));
        }

        int listSize = list.size();
        int errCnt = 0;

        for (int i=0; i<listSize-2; i++){
            if (!list.get(i).equals(list.get(i + 2))){
                errCnt++;
                list.set(i+2, list.get(i));
            }
            //System.out.println(list);
        }

        if (checkListNum(list)){
            errCnt = listSize / 2;
        }

        System.out.println(errCnt);

    }

    private static boolean checkListNum(List<Integer> list){
        for (int i=0; i<list.size() - 1; i++){
            if (!(list.get(i).equals(list.get(i+1)))){
                return false;
            }
        }
        return true;
    }

}