import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
            map.put(i, a[i]);
        }
        Arrays.sort(a);
        int med1 = a[n / 2 - 1];
        int med2 = a[n / 2];
        System.out.println(med1 + " " + med2);
        for(int i = 0; i < n; i++){
            if(map.get(i) <= med1) System.out.println(med2);
            else if(map.get(i) >= med2) System.out.println(med1);
        }
    }
}