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
        int now = 1;
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
        if(count!=0)numS.add(count);
        if(numS.size()%2==0)numS.add(0);
        System.out.println(numS);
        int add = 2 * k + 1;
        int ans = 0;
        //11412
        int left =0;
        int right =0;
        int tmp =0;
        for(int nextleft = 0; nextleft < numS.size(); nextleft += 2)
        {
            int nextright = Math.min( nextleft + add, numS.size() );

            while(nextleft > left)
            {
                tmp -=numS.get(left);
                left++;
            }
            while(nextright > right)
            {
                tmp +=numS.get(right);
                right++;
            }
            ans = Math.max(tmp,ans);
        }

        System.out.println(ans);
    }
}