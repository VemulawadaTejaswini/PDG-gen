import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int[] num = new int[n];
        for(int i = 0;i < n;i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        for(int i = 0;i < n-1;i++){
            if(num[i]==num[i+1]){
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
    }
}