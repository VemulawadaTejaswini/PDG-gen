import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int min = 101;

        for(int i='a'; i<='z'; i++){
            int l=0;
            int max = 0;
            for(int j=0; j<s.length(); j++){
                if((int)s.charAt(j) == i){
                    l = 0;
                }else{
                    l++;
                    if(l>max) max = l;
                }
            }
            if(max < min) min = max;
        }

        System.out.print(min);

    }
}