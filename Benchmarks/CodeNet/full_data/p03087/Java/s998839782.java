import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String s = sc.next();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            if( c=='A' && (i+1) < N ){
                char c2 = s.charAt(i+1);
                if(c2 == 'C'){
                    set.add(i);
                }
            }
        }


        for (int i = 0; i < Q; i++) {
            int l  = sc.nextInt()-1;
            int r  = sc.nextInt()-1;
            int count = 0;
            for (Integer aci :set) {
                if(aci >= l && aci+1 <=r){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}