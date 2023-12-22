import java.util.*;

class Main {

    Main(){
        Scanner SC = new Scanner(System.in);
        int N = Integer.parseInt(SC.next());
        int T = Integer.parseInt(SC.next());

        Map<Integer, Integer> M = new HashMap<Integer, Integer>();
        M.put(0, T);
        int A, B, TEMP;
        for(int i=0;i<N;i++){
            A = Integer.parseInt(SC.next());
            B = Integer.parseInt(SC.next());

            int key = 0;
            while(M.containsKey(key)){
                TEMP = (M.get(key)-B)/(A+1)-1;
                if(TEMP >= 0){
                    if(M.containsKey(key+1)){
                        if(M.get(key+1) < TEMP){
                            M.put(key+1, TEMP);
                        }
                    } else {
                        M.put(key+1, TEMP);
                        break;
                    }
                }
                key++;
            }
        }

        int left, right;
        left  = -1;
        right = N+1;
        while(right-left>1){
            int mid = left + (right-left)/2;

            if(M.containsKey(mid)){
                left = mid;
            } else {
                right = mid;
            }
        }
        System.out.println(left);
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
