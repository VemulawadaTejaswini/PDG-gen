import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()+1;
        int[] a = new int[n];
        int[] ans = new int[n];
        List<Integer> list = new ArrayList<>();
        int j = 1;


        for(int i = 1;i < n;i++){
            list.add(sc.nextInt());
        }
        for(int i = 1;i < n;i++){
            int num = list.indexOf(i)+1;
            ans[i] = num;
            System.out.println(ans[i]);
        }
    }
}