import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        int count = 0;
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i < Q;i++){
            Scanner lsc = new Scanner(System.in);
            int l1 = lsc.nextInt();
            int l2 = lsc.nextInt();
            l.add(l1);
            r.add(l2);
        }

        for(int i = 0;i < l.size();i++){
            for(int x = l.get(i) - 1;x < r.get(i) - 1;x++){
                if((str[x] + str[x + 1]).equals("AC")){
                    count++;
                }
            }
            ans.add(count);
            count = 0;

        }

        for(int i : ans){
            System.out.println(i);
        }

    }
}