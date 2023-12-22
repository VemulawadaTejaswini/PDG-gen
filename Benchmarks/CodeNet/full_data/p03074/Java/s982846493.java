import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        String s=sc.next();
        char[] si  = s.toCharArray();
        char s0='0';
        char s1='1';
        ArrayList<Integer> numS =new ArrayList<Integer>();
        int now = Character.getNumericValue(si[0]);;
        int count=0;
        //101111011->11412へ
        for(char curr:si){
            if(Character.getNumericValue(curr) == now){
                count++;
            }else{
                numS.add(count);
                now=1-now;
                count=1;
            }
        }
        numS.add(count);
        if(numS.size()%2==0)numS.add(0);

        System.out.println(numS);
        int add= 2 * k + 1;
        int ans = 0;
        //11412
        for(int left = 0; left < numS.size(); left += 2)
        {
            int tmp =0;
            int right =Math.min(left + add,numS.size());

            for(int j = left; j < right; j++)
            {
                tmp += numS.get(j);
            }
            ans = Math.max(tmp,ans);
        }

        System.out.println(ans);
    }
}