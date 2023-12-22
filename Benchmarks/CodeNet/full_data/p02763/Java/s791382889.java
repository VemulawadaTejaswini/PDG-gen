import java.util.*;

class Main{

    Main(){
        Scanner SC = new Scanner(System.in);
        int N = Integer.parseInt(SC.next());
        char[] S = SC.next().toCharArray();


        int Q = Integer.parseInt(SC.next());
        int index, left, right;
        char c;
        HashSet<Character> HS = new HashSet<Character>();
        for(int i=0;i<Q;i++){
            if(SC.nextInt() == 1){
                index = SC.nextInt()-1;
                S[index] = SC.next().charAt(0);
            } else {
                left = SC.nextInt();
                right =SC.nextInt();
                HS.clear();
                for(int j=left-1;j<right;j++){
                    HS.add(S[j]);
                }
                System.out.println(HS.size());
            }
        }
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
