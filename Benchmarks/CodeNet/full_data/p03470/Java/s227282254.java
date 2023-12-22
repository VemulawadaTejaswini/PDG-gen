import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int total = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        loop:for(int x=1;x<=total;x++){
            int z = Integer.parseInt(sc.next());
            for(Integer y:list){
                if(z==y) {
                    continue loop;
                }
            }
            list.add(z);
        }
        System.out.println(list.size());
    }
}
