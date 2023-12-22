import java.util.*; 
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        String s = sc.next(), t = sc.next();
 
        int l = calc(n, m);
        int x = l / m;
        int y = l / n;
 
        boolean bl = true;
        for(int i = 0; i * x < n; i++){
            if(s.charAt(i * x) != t.charAt(i * y)){
                System.out.println(-1);
                bl = false;
                break;
            }
        } 
        if(bl)
            System.out.println(l);
 
    }
    static int calc (int n, int m)
    {
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        int tmp = a;
        while(a % b != 0){
            int c = a;
            a = b;
            b = c % b;
        }
        return (int) n * m / b;
    }
 }


