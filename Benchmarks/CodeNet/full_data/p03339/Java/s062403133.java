import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int finalans=s.length()-s.replaceAll("E","").length()-(s.charAt(0)=='E'?1:0);
        int tmp=finalans;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='W')tmp++;
            if(s.charAt(i)=='E')tmp--;
            finalans=Math.min(tmp,finalans);
        }
        System.out.println(finalans);

    }
}