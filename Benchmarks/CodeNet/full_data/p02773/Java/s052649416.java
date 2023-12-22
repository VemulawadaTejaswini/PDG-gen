import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // input N S1 S2 ... Sn
        // N 個の文字列が与えられる
        // 出現回数が最も多い文字列を辞書順で出力する
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        List<String> listStr = new ArrayList<>();
        List<Integer> listNum = new ArrayList<>();
        listStr.add(sc.nextLine());
        listNum.add(1);
        int maxNum = 1;
        for(int i = 1; i < num; i++){
            listStr.add(sc.nextLine());
            for(int j = 0; j < i; j++){
                if(i != j && listStr.get(i).equals(listStr.get(j))){
                    listNum.set(j, listNum.get(j) + Integer.valueOf(1));
                    listNum.add(-1);
                    if(maxNum < listNum.get(j)){
                        maxNum = listNum.get(j);
                    }
                    break;
                }
            }
            if(listNum.size() <= i){
                listNum.add(1);
            }
        }
        List<String> listAnser = new ArrayList<>();
        for(int i = 0; i < num; i++){
            if(listNum.get(i) == maxNum){
                listAnser.add(listStr.get(i));
            }
        }
        Collections.sort(listAnser);
        for(int i = 0; i < listAnser.size(); i++){
            System.out.println(listAnser.get(i));
        }
    }
}
