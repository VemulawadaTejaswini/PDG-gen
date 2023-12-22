import java.util.*;

public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int a = s.length();
            String b[] = s.split("");
            String[] comp1 = new String[a];
            String[] comp2 = new String[a];
            for(int i=0;i<a;i++) {
                comp1[i] = String.valueOf(i / 2 + 1); //白スタート
            }
            //差分比較
            int sum=0;
            for(int i=0;i<a;i++){
                if(b[i].equals(comp1[i])){
                    sum++;
                }
            }
            if(sum>a/2){
                sum=a-sum-1;
            }
            System.out.println(sum);
        }

}

