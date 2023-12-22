import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] ans = new int[n];
        List<Integer> list = new ArrayList<>();
        int search = 1;


        for(int i = 0;i < n;i++){
            list.add(sc.nextInt());
        }

        for(int i = 1;i <= n;i++){
            ans[i-1] = list.indexOf(i)+1;
        }
        for(int i = 0;i < n;i++){
            System.out.println(ans[i]);
        }
    }
}