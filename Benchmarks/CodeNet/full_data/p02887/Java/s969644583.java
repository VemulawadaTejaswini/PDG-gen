import java.util.*;
public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int c=0;
        for(int i=0;i<n;i++){
			char a=s.charAt(i);
            if(i==0){
              c++;
            }else{
            	char b=s.charAt(i-1);
                if(a!=b)c++;
            }
            
        }
        //int o=((int)Math.pow(sum,2)-sum2)/2;
        System.out.println(c);
    }
}