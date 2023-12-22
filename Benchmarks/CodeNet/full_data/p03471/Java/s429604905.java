import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        int Y=sc.nextInt();
        
        int rest,num,numgo,numiti;
        boolean undone=true;
        for(int i=0;i<=Y/10000;i++){
            rest=Y-10000*i;
            num=N-i;
            numgo=(rest-1000*num)/4000;
            numiti=num-numgo;
            if(rest-1000*num>=0&&numiti>=0&&5000*numgo+1000*numiti==rest){
                System.out.println(
                    String.valueOf(i)+" "+
                    String.valueOf(numgo)+" "+
                    String.valueOf(numiti)
                );
                undone=false;
                break;
            }
        }
        if(undone){
            System.out.println("-1 -1 -1");
        }
    }
}
