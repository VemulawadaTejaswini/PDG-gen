import java.util.*;
public class Main {
	public static void main(String[] args)  {
        Scanner scan =new Scanner(System.in);
        String s=scan.next();
        long k = Long.parseLong(scan.next());

        long len=Math.min(s.length(),k);
        char ans = '1';
        for(int i=0;i<len;++i){
            if (s.charAt(i)!='1'){
                ans=s.charAt(i);
                break;
            }
        }
        System.out.print(ans);



}
}
//end