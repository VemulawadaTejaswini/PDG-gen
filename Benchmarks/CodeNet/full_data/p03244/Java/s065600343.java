
 
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n/2];
        int[] b = new int[n/2];
 
        for(int i = 0; i < n/2; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
 
        int ans_a1 = 1;
        int ans_a2 = 1;
        int ans_b1 = 1;
        int ans_b2 = 1;
        
        Arrays.sort(a);
        Arrays.sort(b);
 
        int k = 1; 
        int l = 1;
        int x1 = a[0];
        int y1 = b[0];
 
        for(int i = 1; i < n/2; i++){
            if(a[i] == a[i-1]){
                k++;
                if(ans_a1 <= k){
                    ans_a2 = ans_a1;
                    ans_a1 = k;
                    x1 = a[i-1];
                }
                else if(ans_a2 <= k){
                    ans_a2 = k;
                }
            }
            else{
                k = 1;
            }
        }
 
 
        for(int i = 1; i < n/2; i++){
            if(b[i] == b[i-1]){
                l++;
                if(ans_b1 <= l){
                    ans_b2 = ans_b1;
                    ans_b1 = l;
                    y1 = b[i-1];
                }
                else if(ans_b2 <= l){
                    ans_b2 = l;
                }
            }
            else{
                l = 1;
            }
        }
        int ans = n - (ans_a1 + ans_b1);
 
        if(ans_a1 == n/2) ans_a2 = 0;
        if(ans_b1 == n/2) ans_b2 = 0;
        if(x1 == y1){
            if(ans_a1 > ans_b1)
                ans = Math.min(n - (ans_a1 + ans_b2), n - (ans_b1 + ans_a2));
        }
        System.out.println(ans);
    }
} 