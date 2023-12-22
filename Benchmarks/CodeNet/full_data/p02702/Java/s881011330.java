import java.util.Scanner;

/**
 * @author Orange Summer
 * @date 2020/4/26-20:44
 */
public class EL {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String x=in.nextLine();
        int sum=0;
        for (int j=0;j<x.length();j++) {
            for (int i = 3; i < x.length(); i++) {
                if (i<(j+3)){
                    i=j+3;
                    if(i>=x.length()){
                        i=x.length()-1;
                    }
                }
                long y = Long.parseLong(x.substring(j,i+1));
                if (y % 2019 == 0) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
