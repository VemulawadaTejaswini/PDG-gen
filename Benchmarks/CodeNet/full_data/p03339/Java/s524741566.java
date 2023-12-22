
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        final int N=scanner.nextInt();
        final String string=scanner.next();
        String[] strings=string.split("");
        boolean[] booleans=new boolean[N];
        for(int i=0;i<N;i++){
            if(strings[i].equals("E")) booleans[i]=true;
        }
        int temp=0;
        for(int i=0;i<N;i++){
            if(!booleans[i]) temp++;
        }
        int max=temp;
        for(int i=0;i<N;i++){
            if(booleans[N-i-1]){
                temp++;
            }else{
                temp--;
            }
            if(max>temp) max=temp;
        }
        System.out.println(max);
    }
}