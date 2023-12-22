import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String all = sc.nextLine();
        String sparse = sc.nextLine();
//        String all = "?tc????";
//        String sparse = "coder";
        Map<Character,Integer> incrementals = new HashMap<>(sparse.length());
        for (int i = sparse.length() - 1; 0 < i ; i--) {
            if ( !(incrementals.containsKey(sparse.charAt(i)))) {
                incrementals.put(sparse.charAt(i),i);
            }
        }

        String result = all;

        for (int i = 0; i + sparse.length() <= all.length(); ) {
            for (int j = sparse.length() - 1; j >= 0 ; j--) {
                if (all.charAt(i + j ) =='?' || all.charAt(i + j) == sparse.charAt(j)) {
                    if (j == 0) {
                        result = result.replace(all.substring(i,i+sparse.length()),sparse);
                        result = result.replace("?","a");
                        i = all.length();
                        break;
                    }
                    continue;
                }
                int t = incrementals.getOrDefault(all.charAt(i + j ),1);
                i += 1;
                break;
            }
        }
        System.out.println(result.equals(all) ? "UNRESTORABLE":result);
    }
}