import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
            c[i] = a[i] - b[i];
        }

        for(int i=0; i<n; i++){
            if(a[i] < b[i] * 2 && a[i] != b[i]){
                System.out.println("-1");
                return;
            }
        }

        ArrayList[] data = new ArrayList[50];
        for(int i=0; i<50; i++){
            data[i] = new ArrayList<Integer>();
            for(int j=1; j<=i+1; j++){
                if((i+1) % j == 0){
                    data[i].add(j);
                }
            }
        }

        ArrayList<Integer> use = new ArrayList<Integer>();
        
        out: for(int i=0; i<n; i++){
            if(c[i] == 0) continue;
            for(int j=0; j<data[c[i]-1].size(); j++){
                int tmp = (int)data[c[i]-1].get(j);
                if(use.contains(tmp) && tmp > b[i]) continue out;
            }
            for(int j=0; j<data[c[i]-1].size(); j++){
                int tmp = (int)data[c[i]-1].get(j);
                if(tmp > b[i]){
                    use.add(tmp);
                    continue out;
                }
            }
        }

        long ans = 0;
        for(int i=0; i<use.size(); i++){
            ans += Math.pow(2, use.get(i));
        }
        System.out.println(use);
    }
}