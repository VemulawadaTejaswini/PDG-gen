import java.util.*;
class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int A = sc.nextInt();
        int D[] =  {
            A / 1000,
            (A / 100) % 10,
            (A / 10) % 10,
            A % 10,
        };
        String res = "";
        for(int i = 0; i < 8; i++){
            int c = D[0];
            for(int j = 0; j < 3; j++){
                if((1 & (i >> j)) == 1){
                    c += D[j+1];
                }
                else{
                    c -= D[j+1];
                }
            }
            if(c==7){
                StringBuffer s = new StringBuffer();
                s.append(D[0]);
                for(int j = 0;j < 3; j++){
                    if((1 & (i >> j)) == 1){
                        s.append("+");
                    }
                    else{
                        s.append("-");
                    }
                    s.append(D[j+1]);
                }
                s.append("=7");
                res = s.toString();
            }
        }

        System.out.println(res);
    }
}