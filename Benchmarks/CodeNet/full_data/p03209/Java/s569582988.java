import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double X = sc.nextDouble();
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        String burger = makeBurger(N, map);
        System.out.println(burger);

        String tabeta = burger.substring(burger.length() - (int)X);
        tabeta = tabeta.replace("B","");
        System.out.println(tabeta.length());
    }
    public static String makeBurger(int N, HashMap<Integer, String> map) {
        if(N == 1) {
            return "BPPPB";
        }

        String str = map.get(N-1);
        if(str == null) {
            str = makeBurger(N-1, map);
            map.put(N-1, str);
        }

        return "B" + str + "P" + str + "B";
    }
}