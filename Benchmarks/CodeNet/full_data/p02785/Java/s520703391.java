import java.math.BigInteger;
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Integer> enemy = new ArrayList<Integer>(n);
        long count = 1;

        if(n <= k) {System.out.println("0"); scan.close();}
        else{
            for(int i = 0;i < n;i++){
                enemy.add(scan.nextInt());
            }
            scan.close();
            Collections.sort(enemy);

            for(int j = 0; j < n-k;j++) count += enemy.get(j);
            System.out.println(count);
        }
    }
}