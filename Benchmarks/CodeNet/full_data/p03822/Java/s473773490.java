import java.util.*;

public class Main {

    static HashMap<Integer,LinkedList<Integer>> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //int match[] = new int [N];
        for(int i=2;i<=N;i++){
           int tmp = sc.nextInt();
            if(!map.containsKey(tmp)){
                LinkedList<Integer> list = new LinkedList<>();
                list.add(i);
                map.put(tmp,list);
            }
            else{
                map.get(tmp).add(i);
            }
        }

        //int ans = findDepth(1,match);
        int ans = findDepth(1);

        System.out.println(ans);
//        int sum = 16;
//        System.out.println((int)(Math.log(sum)/Math.log(2.0)));
//        sum = 9;
//        System.out.println((int)(Math.log(sum)/Math.log(2.0)));
//        sum = 15;
//        System.out.println((int)(Math.log(sum)/Math.log(2.0)));




        sc.close();

    }


    private static int findDepth(int tar){
        if(!map.containsKey(tar)) return 0;
        else{
            int max = 0;
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            for(int i:map.get(tar)){
                int t = findDepth(i);
                while(set.contains(t+1)){
                    t++;
                }
                set.add(t+1);
                max= Math.max(max,t+1);

            }
            return max;
        }
    }

 }
