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
        //
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> questionNum = new ArrayList<>();
        List<String> acwa = new ArrayList<>();
        for (int i=0;i<m;++i)
        {
            questionNum.add(sc.nextInt());
            acwa.add(sc.next());
        }

        Map<Integer,Boolean> acMap = new HashMap<>();
        Map<Integer,Integer> waMap = new HashMap<>();
        for (int i=0;i<n;++i)
        {
            acMap.put(i+1,false);
            waMap.put(i+1,0);
        }

        int acCount = 0;
        for (int i = 0;i<m;++i)
        {
            int qn = questionNum.get(i);
            String aw = acwa.get(i);

            if (aw.equals("AC") && !acMap.get(qn))
            {
                ++acCount;
                acMap.put(qn,true);
            } else if (aw.equals("WA"))
            {
                if (!acMap.get(qn))
                {
                    int tmp = waMap.get(qn);
                    ++tmp;
                    waMap.put(qn,tmp);
                }
            }
        }

        int waCount = 0;
        for (int i:acMap.keySet())
        {
            if (acMap.get(i)) waCount += waMap.get(i);
        }

        System.out.println(acCount+" "+waCount);
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