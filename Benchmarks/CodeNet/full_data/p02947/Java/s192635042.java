import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Compute c1 = new Compute();//calc

        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //StringBuilder answer=new StringBuilder();
        long ans = 0;

        //input
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String s[]=new String[n];
        Map<List<String>,Integer> map = new HashMap<>();
        for (int i=0;i<n;++i)
        {
            s[i]=sc.next();
            Map<String,Integer> map2 = new HashMap<>();
            List<String> stringList = new ArrayList<>();
            for (int j=0;j<10;++j)
            {
                String ss=s[i].substring(j,j+1);
                stringList.add(ss);
            }

            Collections.sort(stringList);
            //System.out.println(Arrays.toString(stringList.toArray()));

            if (map.containsKey(stringList))
            {
                int a=map.get(stringList);
                ++a;
                //System.out.println(stringList);
                map.put(stringList,a);
            }else
            {
                //System.out.println(stringList);
                map.put(stringList,1);
            }
        }

        for (List<String> list:map.keySet())
        {
            //System.out.println("key ="+Arrays.toString(list.toArray())+" value = "+map.get(list));
            long b=map.get(list);
            if (b==2)
            {
                ans+=1;
                continue;
            }
            long c=0;
            long aa=1;
            while (true)
            {
                if (c==b) break;
                long d=b-c;
                //System.out.println("d="+d);
                aa*=d;
                ++c;
            }
            //System.out.println(aa);
            ans+=(long)aa/2;
        }

        System.out.println(ans);
        //output
        //System.out.println(String.format("%.0f",answer));
    }
}