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
        //input
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        long n = sc.nextLong();
        String s = sc.next();
        Set<String> set = new HashSet<>();

        for (int i=0;i<n-2;++i)
        {
            for (int j = i+1;j<n-1;++j)
            {
                for (int k = j+1;k<n;++k)
                {
                    StringBuilder stb = new StringBuilder();
                    stb.append(s.substring(i,i+1));
                    stb.append(s.substring(j,j+1));
                    stb.append(s.substring(k,k+1));
                    String s1 = stb.toString();
                    //System.out.println(s1);
                    set.add(s1);
                }
            }
        }

        System.out.println(set.size());

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