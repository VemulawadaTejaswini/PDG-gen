import java.util.*;


public class Main {
    static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        ArrayList<Integer> b = new ArrayList<Integer>();
        int maxA = 0;
        for(int i = 0; i < n; i++) {
            int newA = sc.nextInt();
            int newB = sc.nextInt();
            b.add(newB);
            if(newA > maxA){
                maxA = newA;
            }
        }
        for(int i = n-1; i >= 0; i--){
            if(b.get(i) < maxA){
                b.remove(i);
            }
        }
        int sumB = 0;
        for(int i = b.size()-1; i >= 0; i--){
            sumB += b.get(i);
        }
        int count = 0;
        if(h > sumB){
            h -= sumB;
            count += h/maxA;
            h = h%maxA;
            if(h > 0){
                h -= maxA;
                count++;
            }
            h += sumB;
        }
        Collections.sort(b);
        for(int i = b.size()-1; i >= 0; i--){
            if(h <= 0){
                break;
            }
            h -= b.get(i);
            b.remove(i);
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        solve();
    }
}
