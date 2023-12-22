import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] temp = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            temp[i] = a[i];
        }
        Arrays.sort(temp);
        int max = temp[temp.length - 1];
        for(int i = 0;i < n;i++){
            if (max == a[i]) {
                System.out.println(temp[temp.length - 2]);
                continue;
            }
            System.out.println(max);
        }
    }
}