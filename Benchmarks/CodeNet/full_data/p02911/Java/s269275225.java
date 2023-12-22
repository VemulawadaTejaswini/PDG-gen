import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] point = new int[n];

        for(int i = 0;i < q;i++){
            int ans = sc.nextInt()-1;
            point[ans]++;
        }
        
        for(int i = 0;i < n;i++){
            int jdg = k-q+point[i];
            if(jdg > 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}