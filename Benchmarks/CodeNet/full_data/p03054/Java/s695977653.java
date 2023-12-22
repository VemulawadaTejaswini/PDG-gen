import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int SR = sc.nextInt();
		int SC = sc.nextInt();
		String S = sc.next();
		String T = sc.next();

        int sco[] = new int[4];
        int tco[] = new int[4];
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('L', 0);
        map.put('D', 1);
        map.put('U', 2);
        map.put('R', 3);
        
        sco[0] = 0; sco[1] = 0; sco[2] = 0; sco[3] = 0;
        tco[0] = 0; tco[1] = 0; tco[2] = 0; tco[3] = 0;
        
        boolean swin = false;
        for(int i = 0; i < N; i++){
            sco[map.get(S.charAt(i))]++;
            if((sco[0] - tco[3]) >= SC || (sco[1] - tco[2]) > (H - SR) ||
               (sco[2] - tco[1]) >= SR || (sco[3] - tco[0]) > (W - SC)){
                swin = true;
                break;
            }
            if((T.charAt(i) == 'U' && tco[2] - sco[1] != H - SR) ||
               (T.charAt(i) == 'D' && tco[1] - sco[2] != SR - 1) ||
               (T.charAt(i) == 'L' && tco[0] - sco[3] != SC - 1) ||
               (T.charAt(i) == 'R' && tco[3] - sco[0] != W - SC)){
                tco[map.get(T.charAt(i))]++;
            }
        }
        
        if(swin){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
        
    }
}

