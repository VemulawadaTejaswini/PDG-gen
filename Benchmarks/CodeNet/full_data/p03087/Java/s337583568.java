import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int count = 0;
        String[] S = sc.next().split("");
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i < Q;i++){
            l.add(sc.nextInt());
            r.add(sc.nextInt());
        }
        for(int i = 0;i < Q;i++){
            for(int x = l.get(i)-1;x < r.get(i)-1;x++){
                if(S[x].equals("A") && S[x+1].equals("C")){
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