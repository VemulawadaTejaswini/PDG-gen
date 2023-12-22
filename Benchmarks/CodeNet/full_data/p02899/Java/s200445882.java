import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> maps = new HashMap<>();
        for(int i=0;i<n;i++){
            maps.put(sc.nextInt(), i+1);
        }
        for(int i=0;i<n;i++){
            System.out.print(maps.get(i+1) +" ");
        }
    }
}
