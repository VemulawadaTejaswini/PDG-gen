
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        final int N=scanner.nextInt();
        final String string=scanner.next();

        String[] strings=string.split("");
        int min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            String[] beki=new String[strings.length];
            for(int j=0;j<N;j++){
                if(j<i){
                    beki[j]="E";
                }else{
                    beki[j]="W";
                }
            }
            int sub=0;
            for(int j=0;j<N;j++){
                if(j==i) continue;
                if(!strings[j].equals(beki[j])) sub++;
            }

            if(min>sub) min=sub;
        }
        System.out.println(min);
    }
}