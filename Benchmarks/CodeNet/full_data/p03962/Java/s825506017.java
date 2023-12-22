import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        System.out.println(getKinds(list));
    }

    public static  int getKinds(List<Integer> list){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < list.size(); i++){
            set.add(list.get(i));
        }
        return  set.size();
    }
}