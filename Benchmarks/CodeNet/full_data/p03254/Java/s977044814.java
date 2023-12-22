import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int count = 0;
        int i = 0;
        while(x >= a[i]){
            x -= a[i];
            if(i < n-1 || ( i == n-1 && a[i] == x)){
                count++;
            }
            i++;
            if(i == n) break;
        }
        System.out.println(count);
    }
}