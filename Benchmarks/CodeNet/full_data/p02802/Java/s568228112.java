import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//ques No
        int m = sc.nextInt();//ans No

        int p;//ques No
        String s;//kekka

        Set<Integer> OK = new HashSet<Integer>(); //AC count
        List<Integer> PENA = new ArrayList<>();//wrong
        // List<Integer> list = new ArrayList<>();

        int[] ok_ar = new int[n];//in first oK

        for(int i = 0;i<n;i++){
            ok_ar[i] = 0;
        }

        for(int i = 0 ; i < m ; i++){
            p = sc.nextInt()-1;
            s = sc.next();

            if(s.equals("WA") && ok_ar[p] == 0){
                PENA.add(p);
            }else if(s.equals("AC")){
                OK.add(p);
                ok_ar[p] = 1;
            }
        }
        int ok = OK.size();
        int pena = PENA.size();
        System.out.print(ok + " "+pena);

    }
}