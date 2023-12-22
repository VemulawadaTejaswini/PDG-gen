import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int kosuu = sc.nextInt();
        int[] flower2 = new int[kosuu];
        for (int i = 0; i < kosuu; i++) {
            flower2[i] = sc.nextInt();
        }
        
        saiki(flower2);
        System.out.println(counter);
    }
    static int counter = 0;
        private static void saiki(int[] hikisuu){
            int[] hairetu;
            int min = Integer.MAX_VALUE;
            for (int k = 0; k < hikisuu.length; k++) {
                int v = hikisuu[k];
                if (v < min) {
                    min = v;
                }
            }
            counter += min;
            for(int h = 0;h < hikisuu.length;h++) {
                hikisuu[h] = hikisuu[h] - min;
            }
            int kioku = 0;
            for (int i = 0; i < hikisuu.length; i++) {
                if (hikisuu[i] == 0) {
                    if (kioku != i) {
                        hairetu = Arrays.copyOfRange(hikisuu, kioku, i);
                        saiki(hairetu);
                    }
                    kioku = i + 1;
                } 
            }
            if (kioku != hikisuu.length) {
                hairetu = Arrays.copyOfRange(hikisuu, kioku, hikisuu.length);
                saiki(hairetu);
            }

//            for(int j = 1; j < hairetu.length; j++){
//                saikihairetu[j] = hairetu[j] - min;
//                counter += min;
//            }
//            saiki(hairetu);
        }
        //System.out.println(counter);
    }