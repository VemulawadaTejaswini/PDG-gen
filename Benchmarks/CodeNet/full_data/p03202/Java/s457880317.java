import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = b[i] = sc.nextInt();
        }
        int[] x = new int[100000000];
        Arrays.fill(x, 0);
        int max = 0;
        for(int i = 1; i < n; i++){
            if(a[i-1] > a[i]){
                if(x[a[i] - 1] == max){
                    x[a[i] - 1] = ++max;
                }
                else{
                    x[a[i] - 1] = x[a[i] - 1] + 1;
                }
            }
            else if(a[i-1] == a[i]){
                if(x[0] == max){
                    Arrays.fill(x, 0, a[i] - 2, 0);
                    x[a[i] - 1] = max + 1;
                }
                else{
                    for(int j = a[i] - 1; j >= 0; j++){
                        if(x[j] != max){
                            x[j]++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(++max);
    }
}