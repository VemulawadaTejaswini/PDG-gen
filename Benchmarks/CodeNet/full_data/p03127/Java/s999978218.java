import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=0;i<a;i++){
            int b = sc.nextInt();
            list.add(b);
        }
            
        System.out.println(list);
        
        long x = list.remove(0);
        long y;
        long z;
        for (int i=0;list.size()>0;i++){
            y = list.remove(0);
            x = saidaiKoyaku(x,y);
        }
        System.out.println(x);


    }
    
    static private long saidaiKoyaku(long x, long y){
        if (y==0){
            return x;
        }
        return saidaiKoyaku(y, x % y);
    }
}