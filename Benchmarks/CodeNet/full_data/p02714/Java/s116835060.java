import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static Set<Integer> getHigherSet(Set<Integer> set,int num) {
        Set higherSet = new TreeSet<>();

        for(int member: set) {
            if(member > num) {
                higherSet.add(member);
            }
        }
        return higherSet;

    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        long ans = 0;
        Set<Integer> Rlist = new TreeSet<>();
        Set<Integer> Glist = new TreeSet<>();
        Set<Integer> Blist = new TreeSet<>();

        for(int i=0;i<N;i++){
            if(S[i] == 'R'){
                Rlist.add(i);
            } else if(S[i] == 'G'){
                Glist.add(i);
            } else if(S[i] == 'B'){
                Blist.add(i);
            }
        }
        for(int Rnum: Rlist) {
            for(int Gnum: Glist) {
                ans += Blist.size();
                //R < G < B OK
                //B < G < R OK
                if(Blist.contains(2*Gnum - Rnum)){
                    ans--;
                }
                //R < B < G OK
                //G < B < R OK
                if((Gnum+Rnum) %2 == 0 && Blist.contains((Gnum + Rnum)/2)){
                    ans--;
                }
                //B < R < G OK
                //G < R < B OK
                if(Blist.contains(2*Rnum - Gnum)){
                    ans--;
                }
            }
        }

        System.out.println(ans);

    }

}







