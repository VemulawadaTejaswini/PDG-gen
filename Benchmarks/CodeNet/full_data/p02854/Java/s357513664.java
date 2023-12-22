import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //StringBuilder answer=new StringBuilder();
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        long aSum = 0;
        for (int i=0;i<n;++i)
        {
            a[i]=sc.nextLong();
            aSum+=a[i];
        }
//        System.out.println(aSum);
//        System.out.println(aSum/2);

        long half = aSum/2;

        long halfSum = 0;
        int ind = 0;
        for (int i=0;i<n;++i)
        {
            halfSum+=a[i];

            if (halfSum >= half)
            {
                long cand1 = Math.abs(half-halfSum);
                long cand2 = Math.abs(half-(halfSum-a[i]));

                if (cand1 <= cand2) ind = i;
                else if (cand1 > cand2)
                {
                    halfSum-=a[i];
                    ind = i-1;
                }

                break;
            }
        }

        long halfSum2 = 0;
        for (int i=ind+1;i<n;++i)
        {
            halfSum2 += a[i];
        }

        long ans = Math.abs(half-halfSum);
        ans += Math.abs(half-halfSum2);

        System.out.println(ans);

        sc.close();
    }

    public class Pair<F,S>
    {
        private final F first;
        private final S second;

        Pair(F first,S second)
        {
            this.first = first;
            this.second = second;
        }

        public void print() { System.out.println("("+this.first+","+this.second+")"); }

        //get
        public F first() {return this.first;}
        public S second() {return this.second;}

        @Override
        public boolean equals(Object object)
        {
            if (object instanceof Pair)
            {
                Pair pair = (Pair)object;
                return this.first==pair.first && this.second==pair.second;
            }else
            {
                return false;
            }
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(first,second);
        }
    }
}