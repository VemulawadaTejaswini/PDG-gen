import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        long Bombc = scan.nextInt();
        long Bombs = scan.nextInt();
        long exdmg = Bombc - Bombs;
        long mnstrhp[] = new long[num];
        long cpy[] = new long[num];

        for (int i = 0; i < num; i++) {
            mnstrhp[i] = scan.nextLong();
        }

        for(int i = 0;i<num;i++) {
            cpy[i] = mnstrhp[i];
        }

        int l = 0;
        int r = 1000000001;

        long  dmgcount = 0;

        while (l < r - 1) {

            for(int i = 0;i<num;i++){
                mnstrhp[i] = cpy[i];
            }

            int m = (l+r)/2;
            long o = m;


            for(int i = 0;i<num;i++){
                mnstrhp[i] -= (Bombs*m);
            }

            for(int i = 0;i<num;i++){
                if(mnstrhp[i]>0){
                    dmgcount = ((mnstrhp[i] % exdmg) ==0) ? (mnstrhp[i]/exdmg) : (mnstrhp[i]/exdmg) + 1;
                        o -= dmgcount;
                }
            }



            if (o>=0) {
                r = m;
            } else {
                l = m;
            }

        }
        System.out.println(r);
    }
}
