import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        List<List<Character>> list = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            List<Character> list2 = new ArrayList<>();
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                list2.add(s.charAt(j));
            }
            list.add(list2);
        }
        while(true) {
            int size = list.size();
            List<Integer> list3 = new ArrayList<>();
            int index = 0;
            for (List<Character> list2 : list) {
                boolean flag = true;
                for (int i = 0; i < list2.size(); i++) {
                    if(list2.get(i) == '#') {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    list3.add(index);
                }
                index++;
            }
            Collections.sort(list3);
            Collections.reverse(list3);
            for (int i : list3) {
                list.remove(i);
            }
            if(size == list.size()) {
                break;
            }
        }
        while(true) {
            int size = list.get(0).size();
            List<Integer> list3 = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                boolean flag = true;
                for (int j = 0; j < list.size(); j++) {
                    char tmp = list.get(j).get(i);
                    if(tmp == '#') {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    list3.add(i);
                }
            }
            Collections.sort(list3);
            Collections.reverse(list3);
            for (int i : list3) {
                for (int j = 0; j < list.size(); j++) {
                    list.get(j).remove(i);
                }
            }
            if(size == list.get(0).size()) {
                break;
            }
        }
        for (List<Character> list2 : list) {
            for (int i = 0; i < list2.size(); i++) {
                System.out.print(list2.get(i));
            }
            System.out.println();
        }
    }
}