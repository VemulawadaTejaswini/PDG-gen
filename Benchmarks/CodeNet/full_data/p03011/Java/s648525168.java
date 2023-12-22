import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        List<Integer> nums = new ArrayList<Integer>();
        for(int i=0;i<3;i++){
            nums.add(Integer.parseInt(in[i]));
        }
        int a1=Collections.min(nums);
        nums.remove(nums.indexOf(a1));
        int a2=Collections.min(nums);
        System.out.println(a1+a2);
    }
}