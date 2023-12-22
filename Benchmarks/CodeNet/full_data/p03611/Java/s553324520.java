import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int hmn = sc.nextInt();
        int nam[] = new int[200000];
        
        for(int i = 0;i < hmn;i++ ){
         int now = sc.nextInt();
             nam[now]++;
             nam[now + 1]++;
             nam[now + 2]++;
        }
        Arrays.sort(nam);
        System.out.println(nam[200000-1]);
    }
}