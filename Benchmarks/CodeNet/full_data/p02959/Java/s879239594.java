import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] townmonster = new long[n+1];
        for(int i=0;i<n+1;i++){
            townmonster[i] = sc.nextLong();
        }

        long[] yusha = new long[n+1];
        for(int i=0;i<n;i++){
            yusha[i] = sc.nextLong();
        }
        yusha[n] = 0;

        long count =0;
        long yojou = 0;
        for(int i=0;i<n+1;i++){
            long target = townmonster[i];
            long yusha_yoryoku = yusha[i];
            if(target >= yusha_yoryoku + yojou){
                //System.out.println("if target=" + target + " yusha_yoryoku=" + yusha_yoryoku + " yojou=" + yojou + " count=" + count);
                count += yusha_yoryoku+yojou;
                yojou = 0;
            }else{
                //System.out.println("else target=" + target + " yusha_yoryoku=" + yusha_yoryoku+ " yojou=" + yojou + " count=" + count);
                count +=target;
                long nokori = target - yojou;
                if(nokori >0){
                    yojou = yusha_yoryoku-nokori;
                }else{
                    yojou = yusha_yoryoku;
                }
            }
        }
        System.out.println(count);




    }
}