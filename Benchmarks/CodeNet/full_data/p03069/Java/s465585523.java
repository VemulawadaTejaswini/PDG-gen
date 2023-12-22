import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            String S = sc.next();
        sc.close();
        
        int white = 0;
        int black = 0;
        int[] color = new int[N];
        String[] text = new String[N];

        for (int i = 0; i < N; i++) {
            text[i] = String.valueOf(S.charAt(i));
            if(i != 0 && text[i].equals("#")){
                black++;
                color[i] = color[i-1]+1;
            }else if(i == 0 && text[i].equals("#")){
                black++;
                color[i] = 1;
            }else if(i == 0 && text[i].equals(".")){
                white++;
                color[i] = 0;
            }else{
                white++;
                color[i] = color[i-1];
            }


            //System.out.println(color[i]);
        }

        //System.out.println(black);
        //System.out.println(white);


        int ans = 300000;
        int tmp= 0;
        for (int i = 0; i < N-1; i++) {
                int bb = color[i];
                int ww = (N-i-1) - (color[N-1] - color[i]);
                //System.out.println(bb);
                //System.out.println(ww);
                tmp = bb+ww;
                //System.out.println(tmp);

                if(ans > tmp){
                    ans = tmp;
                }
        }

        if(white == 0 || black == 0){
            System.out.println("0");
        }else{
            System.out.println(ans);
        }

    }
}