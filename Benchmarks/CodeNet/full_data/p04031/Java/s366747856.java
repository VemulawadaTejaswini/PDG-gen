import java.util.*;

public class Main {

    public static int sum(int n){
        return (1+n)*n/2;
    }

    public static String conv(String in){
        ArrayList<String> list
            = new ArrayList<String>();

        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == 'B') {
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                }
            } else {
                list.add(""+in.charAt(i));
            }
        }

        String result = "";
        for (String s : list) {
            result += s;
        }

        return result;
    }
    
    public static int getMinCost (int[] in) {
        int min = Integer.MAX_VALUE;
        for (int a : in) {
            int tmp = 0;
            for (int b : in) {
                tmp += (a - b)*(a - b);
            }
            if (tmp < min) {
                min = tmp;
            }
        }
        return min;
    }

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

        int[] in = new int[n];

        for (int i = 0; i < in.length; i++) {
            in[i] = sc.nextInt();
        }
        System.out.println(getMinCost(in));
	}
}
