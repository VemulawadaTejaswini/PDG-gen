import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt(),count,count2;
        String ans = "No";
        List<String> hList = new ArrayList<>();
        List<String> wList = new ArrayList<>();
        for (int i = 0; i < h; i++) {hList.add(sc.next());}
        for (int i = 0; i < w; i++) {wList.add(sc.next());}
        for (int i = 0; i < w; i++) {
            count = hList.get(i).indexOf(wList.get(i));
            if (count != -1) {
                for (int j = 1; j < w; j++) {
                    if (dfs(count, hList.get(j), wList.get(j))) {
                    } else {
                        break;
                    }
                    if(j == w-1) ans = "Yes";
                }
            }
            for (int k = 0; k < w; k++) {
                count2 = hList.get(k).lastIndexOf(wList.get(k));
                if (count2 != -1) {
                    for (int j = 1; j < w; j++) {
                        if (dfs(count2, hList.get(j), wList.get(j))) {
                        } else {
                            break;
                        }
                        if(j == w-1) ans = "Yes";
                    }
                }
            }
        }

        System.out.println(ans);
    }
    static boolean dfs(int index,String hList,String wList){
            if(hList.indexOf(wList) == index) {
                return true;
            }else{
                return false;
            }
    }
}
