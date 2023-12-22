
import java.util.*;
public class Main {

    static class Struct{
        Long x,y;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(),k = cin.nextInt();
        List<Struct> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Struct struct = new Struct();
            struct.x = cin.nextLong();
            struct.y = cin.nextLong();
            list.add(struct);
        }
       Collections.sort(list, new Comparator<Struct>() {
           @Override
           public int compare(Struct o1, Struct o2) {
               return o2.y.compareTo(o1.y);
           }
       });
        int  cnt = 0,type = 0;
        long ans = 0, res =  0;
        Stack<Long> stack = new Stack<>();
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i <n; i++) {
            Struct item = list.get(i);
            if (cnt < k) {
                if (map.get(item.x) == null) {
                    //未出现过
                    map.put(item.x, 1);
                    type++;
                }else{
                    //已经存在
                    stack.push(item.y);
                }
                res += item.y ;
                ans = Math.max(ans, res + type * type);
                cnt++;
            }else{
                // 满了，需要淘汰
                if (stack.empty()) {
                    break;
                }
                if (map.get(item.x) != null) {
                    continue;
                }
                type++;
                res = res - stack.peek() + item.y;
                stack.pop();
                ans = Math.max(ans, res + type * type);
            }
        }

        System.out.println(ans);
    }
}
