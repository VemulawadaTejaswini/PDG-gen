import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String line = sc.nextLine();
        check(num, line);
    }

    public static void check(String num, String line) {

        String[] strs = num.split(" ");
        int[] nums = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }

        String[] lines = line.split(" ");
        int[] vals = new int[lines.length*nums[1]];
        int k=0;
        for (int j = 0; j < nums[1]; j++) {
            for (int i = 0; i < lines.length; i++) {
                vals[k+i] = Integer.parseInt(lines[i]);
            }
            k+=lines.length;
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < vals.length; i++) {
            if(list.contains(vals[i])) {
                delList(list, i);
            } else {
                list.add(new Integer(vals[i]));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(i== list.size()-1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    private static void delList(LinkedList<Integer> list, int i) {
        if(list.size() == 0) {
            return;
        }
        list.pop();
        if(list.contains(i)) {
            delList(list,i);
        }
    }
}