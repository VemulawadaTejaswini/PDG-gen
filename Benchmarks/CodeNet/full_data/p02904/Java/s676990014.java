import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

//        int[] arr = new int[n];
//        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        String s = "";
        for (int i=0; i<n; i++) s += sc.next();


//        int[] change = new int[n];

        Map<String, Integer> map = new HashMap<>();
        map.put(s, 1);

        for (int i=0; i<n-k+1; i++){
            char[] c = s.toCharArray();
            char[] c1 = new char[k];
            for (int j=0; j<k; j++){
                c1[j] = c[i];
                i++;
            }
            Arrays.sort(c1);
//            System.out.println(c1);
            i -= k;
            int y = 0;
            for (int z=i; z<i+k; z++){
//                int y = 0;
//                i -= k;
                c[z] = c1[y];
                y++;
//                z++;
            }
//            i -= k;
            c.toString();
//            System.out.println(c);
//            String s0 = s.substring(0, i+1);
//            System.out.println(s0);
//            String s1 = s.substring(i, i+k);
////            System.out.println(s1);
//            String s2 = s.substring(i+k, n);
//            char[] c = s1.toCharArray();
//            Arrays.sort(c);
////            System.out.println(c);
//            c.toString();
////            System.out.println(c);
//            String s3 = "";
//            s3 = s0+c+s2;
////            System.out.println(s3);
            String tc = "";
            for (int q=0; q<c.length; q++){
                tc += c[q];
            }

            int cnt = map.containsKey(tc) ? map.get(tc) : 0;
            map.put(tc, cnt + 1);
        }

        System.out.println(map.size());
//        int ans = 0;
//        for (String key: map.keySet()){
//            ans += map.get(key);
//        }
//
//        System.out.println(ans);
//        System.out.println(map);


//        int[] arr = {3,2};
//        int[] arr2 = {1,2};

//        System.out.println(Arrays.equals(arr, arr2));


    }
}