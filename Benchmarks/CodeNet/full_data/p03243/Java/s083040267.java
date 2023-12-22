import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;
        for(int i = n; i < 1000; i++){
            int k = i / 10;
            int l = i - (int)((i / 100) * 100);
            if(k == l){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}