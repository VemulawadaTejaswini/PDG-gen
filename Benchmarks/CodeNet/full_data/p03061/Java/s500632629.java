import java.util.*;

public class Main{

    public static int gcd(int a, int b){
        if (a%b==0) return b;
        else{
            return gcd(b, a%b);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        for (int i=0; i<n; i++) a.add(sc.nextInt());

//        for (int i=0 ;i<n; i++){
//            if (a.remove(a.get(i)))
//        }

        int ans = 0;
//        int a[] = new int[n];
//        int ans_list[] = new int[n];
        List<Integer> ans_list = new ArrayList<>();


        for (int i=0; i<n; i++){
            ans = 0;
            int tmp = a.get(i);
            a.remove(a.get(i));
            for (int j= 0; j<n-1; j++){
                ans = gcd(ans, a.get(j));
            }
            a.add(i, tmp);
            ans_list.add(ans);
        }

        for (int i=0; i<n-1; i++){
            ans = Math.max(ans_list.get(i), ans);
        }

//        System.out.println(ans_list);
//        System.out.println(a);
        System.out.println(ans);

    }

        }
