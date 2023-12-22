import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int count = 0;
        boolean bl;
        for(int i=0; i<n; i++){
            bl = true;
            while(bl == true){
                if(a[i] % 2 == 0){
                    a[i] /= 2;
                    count++;
                }
                else{
                    bl = false;
                }
            }
        }
        System.out.println(count);
    }
}