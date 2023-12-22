import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int A = sc.nextInt();
        TreeMap<Integer, Integer> monsters = new TreeMap<>();
        for(int i=0;i<N;i++){
            int X = sc.nextInt();
            int H = sc.nextInt();
            monsters.put(X, H);
        }
        long cnt=0;
        for(Integer x:monsters.navigableKeySet()){
            int hp = monsters.get(x);
            if(hp <= 0){continue;}
            int dmg = hp%A==0 ? hp : (hp/A+1)*A;
            cnt += (dmg/A);
            for(Integer x2:monsters.navigableKeySet()){
                if(x2 <= x){
                    continue;
                }
                if(x2 > x+2*D){
                    break;
                }
                monsters.put(x2, monsters.get(x2)-dmg);
            }
        }
        System.out.println(cnt);
    }
}
