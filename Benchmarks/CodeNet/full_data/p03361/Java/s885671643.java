import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    static int H;
    static int W;

    public static void main(String[] args) {

        String num_line = sc.nextLine();
        String[] nums = num_line.split(" ");
        H = Integer.parseInt(nums[0]);
        W = Integer.parseInt(nums[1]);

        char[][] FIELD = new char[H][W];

        for(int i=0; i<H; i++){
            String line = sc.nextLine();
            for(int w=0; w<W; w++){
                FIELD[i][w] = line.charAt(w);
            }
        }

        // special case
        if(H == 1 && W==1){
            System.out.println("Yes");
            return;
        }


        if(checkIsolated(FIELD)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    private static boolean checkIsolated(char[][] field) {

        int[] next_H = {0, 1, 0, -1};
        int[] next_W = {1, 0, -1, 0};

        for(int h=0; h<H; h++){
            for(int w=0; w<H; w++){

                if(field[h][w] == '#') {

                    boolean isolated = true;

                    for (int i = 0; i < 4; i++) {
                        int tmp_H = h + next_H[i];
                        int tmp_W = w + next_W[i];

                        if(tmp_H<0 || tmp_H>H-1 ){
                            continue;
                        }else if(tmp_W<0 || tmp_W>W-1){
                            continue;
                        }else{
                            if(field[tmp_H][tmp_W] == '#'){
                                isolated = false;
                            }
                        }
                    }

                    if(isolated){
                        return false;
                    }
                }
            }
        }

        return true;

    }


    private static int readInt(){
        return Integer.parseInt(sc.next());
    }

    private static long readLong(){
        return Long.parseLong(sc.next());
    }

}
