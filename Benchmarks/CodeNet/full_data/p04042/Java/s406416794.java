import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> arr = new ArrayList<>();
    static String[][] dpTable;
    static boolean[][] used;
    static String dp(int i, int k){
        String entry_in_table;
        if(i == arr.size() && k == 0)
            entry_in_table = "";
        else if(k == 0){
            entry_in_table = "";
        }
        else if(i == arr.size())
            entry_in_table = null;
        else {
            String s = arr.get(i);

            if(used[i][k]){
                return dpTable[i][k];
            }

            if(s.length() > k){
                entry_in_table = dp(i+1, k);
            } else {

                String s1 = dp(i + 1, k);
                String s2 = dp(i + 1, k-s.length());

                if (s1 == null && s2 == null){
                    entry_in_table =  null;
                }else if(s1 == null)
                    entry_in_table = s + s2;
                else if(s2 == null)
                    entry_in_table = s1;
                else if(s1.compareTo(s + s2) < 0){
                    entry_in_table = s1;
                } else{
                    entry_in_table = s + s2;
                }
            }
        }
        dpTable[i][k] = entry_in_table;
        used[i][k] = true;
        return entry_in_table;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        used = new boolean[n+1][k+1];
        dpTable = new String[n+1][k+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<k+1; j++){
                dpTable[i][j] = null;
            }
        }
        for(int i =0; i< n; i++){
            arr.add(kb.next().trim());
        }
        System.out.println(dp(0, k));
    }
}
