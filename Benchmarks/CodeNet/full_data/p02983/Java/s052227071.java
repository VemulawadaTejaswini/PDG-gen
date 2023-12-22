import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,r;
        l = Integer.parseInt(sc.next());
        r = Integer.parseInt(sc.next());

        int min = Integer.MAX_VALUE;

        for(int i=(l==0)?1:l;i<r;i++){
            for(int j=i+1;j<r;j++){
                if(min>(i*j)%2019){
                    min = (i*j)%2019;
                }
            }
        }

        if(min==Integer.MAX_VALUE){
            min =  l*r;
        }

        System.out.println(min);
    }
}