import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int Bombc = scan.nextInt();
        int Bombs = scan.nextInt();
        int exdmg = Bombc - Bombs;
        int mnstrhp[] = new int[num];
        int cpy[] = new int[num];
        int count = 0;

        for (int i = 0; i < num; i++) {
            mnstrhp[i] = scan.nextInt();
        }
        for(int i = 0;i<num;i++) {
            cpy[i] = mnstrhp[i];
        }

        int l = 0;
        int r = 1000000001;

        int dmgcount = 0;
        boolean extnct = true;

        while (l < r - 1) {

            for(int i = 0;i<num;i++){
                mnstrhp[i] = cpy[i];
            }

            int m = (l+r)/2;
            int o = m;

            extnct = true;

            for(int i = 0;i<num;i++){
                mnstrhp[i] -= (Bombs*m);
            }

            for(int i = 0;i<num;i++){
                if(mnstrhp[i]>0&&o>0){
                    dmgcount = (mnstrhp[i] % exdmg==0) ? mnstrhp[i]/exdmg : (mnstrhp[i]/exdmg) + 1;
                    if(o >= dmgcount) {
                        mnstrhp[i] -= dmgcount*exdmg;
                    o -= dmgcount;
                    }
                }
            }

            for(int i = 0;i<num;i++){
                if(mnstrhp[i]>0){
                    extnct = false;
                }
            }

            if (extnct) {
                r = m;
            } else {
                l = m;
            }

        }
        System.out.println(r);
    }
}
