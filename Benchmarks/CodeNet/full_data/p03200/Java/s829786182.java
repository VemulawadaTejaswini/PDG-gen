import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();

        LinkedList<Integer> list = search(s);
        int c = 0;
        while (list.size() > 0){
            LinkedList<Integer> nexts = new LinkedList<>();
            for (int i:list){
                s[i] = 'W';
                s[i + 1] = 'B';
                if(i >= 1 && s[i - 1] == 'B'){
                    nexts.add(i - 1);
                }
                if(i < s.length - 2 && s[i + 2] == 'W'){
                    nexts.add(i);
                }
                ++c;
            }
            list = nexts;
        }
        System.out.println(c);
    }

    public static LinkedList<Integer> search(char[] cs){
        LinkedList<Integer> ret = new LinkedList<>();
        for (int i = 0;i < cs.length - 1;++i){
            if(cs[i] == 'B' && cs[i + 1] == 'W'){
                ret.add(i);
                ++i;
            }
        }
        return ret;
    }
}


