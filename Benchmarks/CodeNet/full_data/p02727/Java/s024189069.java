import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int[] arrA = new int[a];
        int b = sc.nextInt();
        int[] arrB = new int[b];
        int c = sc.nextInt();
        int[] arrC = new int[c];
        for(int i = 0; i < a; i++)
            arrA[i] = sc.nextInt();
        for(int i = 0; i < b; i++)
            arrB[i] = sc.nextInt();
        for(int i = 0; i < c; i++)
            arrC[i] = sc.nextInt();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        Arrays.sort(arrC);
        int[] selected = new int[x + y];
        int idx = 0;
        for(int i = a - 1; i >= a - x; i--)
            selected[idx++] = arrA[i];
        for(int i = b - 1; i >= b - y; i--)
            selected[idx++] = arrB[i];
        Arrays.sort(selected);
        for(int i = 0, j = c - 1; i < a + b && j >= 0; i++, j--)
            if(selected[i] >= arrC[j]) break;
            else selected[i] = arrC[j];
        long sum = 0;
        for(long num : selected)
            sum += num;
        System.out.println(sum);
    }
}