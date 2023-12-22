import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        List<Integer> values = Arrays.asList(scan.nextLine().split(" ")).stream().map(i->new Integer(i)).collect(Collectors.toList());
        Map<Integer,Integer> searchResult = new HashMap<>();
        int i;
        for(i=0;i<values.get(values.size()-1);i++){
            searchResult.put(calc(values,i),i);
        }
        // キーでソートする
        Object[] mapkey = searchResult.keySet().toArray();
        Arrays.sort(mapkey);
        for (Integer nKey : searchResult.keySet()){
            System.out.println(searchResult.get(nKey));
            break;
        }
    }

    public static int calc(List<Integer> list,Integer point){
        Integer result = 0;
        int i;
        for(i=0;i<list.size();i++){
            result += ((list.get(i) - point) * (list.get(i) - point));
        }
        return result;
    }
}
