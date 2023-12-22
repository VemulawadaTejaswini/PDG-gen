public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; ++i){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
 
        int max = a[1];
//        System.out.println("max: " + max);
    
        for (int i = max; i >= 1 ; i--){
//            System.out.println("i: " + i);
            int c = 0;
            for (int j = 0; j < n; ++j){
                if (a[j]%i != 0){
                    c++;
                }
            }
//            System.out.println("count: " + count);
            if (c == 1 || c == 0){
                System.out.println(i);
                break;
            }
        }
    }
}