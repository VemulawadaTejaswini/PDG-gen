import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();
        String S = sn.next();
        List<String> list = new ArrayList<>();
        int r = 0;
        int g = 0;
        int b = 0;

        for(int i=0; i<N; i++){
            String s = S.substring(i, i+1);
            list.add(s);
            switch(s){
                case "R":
                    r++;
                    break;
                case "G":
                    g++;
                    break;
                case "B":
                    b++;
                    break;
            }
        }

        long all = r*g*b;
        long sub = 0;

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(list.get(i).equals(list.get(j))) continue;

                int k = j*2 - i;

                if(k >= N || list.get(k).equals(list.get(i)) || list.get(k).equals(list.get(j))) continue;
                    sub++;   
            }
        }

        System.out.println(all-sub);


    }
}