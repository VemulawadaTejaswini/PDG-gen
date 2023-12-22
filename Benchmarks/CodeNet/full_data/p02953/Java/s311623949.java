import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean canLow1 = true;
        ArrayList<Integer> hl = new ArrayList<>();
        int prev = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            hl.add(sc.nextInt());
        }
        Collections.reverse(hl);
        for(int i = 0; i < n; i++){
            int now = hl.get(i);
            if(prev >= now){
                prev = now;
            }else if(prev+1 == now && canLow1){
                canLow1 = false; 
            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
