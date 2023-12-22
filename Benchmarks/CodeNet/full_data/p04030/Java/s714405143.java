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
    
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next();
		System.out.println(conv(a));
	}
}
