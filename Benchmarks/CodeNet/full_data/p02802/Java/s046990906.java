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
        List<Integer> acQ = new ArrayList<>();
        Map<Integer,Integer> waCount = new HashMap<>();

        int acCount = 0;
        for (int i = 0;i<m;++i)
        {
            int qn = questionNum.get(i);
            String aw = acwa.get(i);

            if (aw.equals("AC") && !(acQ.contains(qn)))
            {
                //System.out.println(1);
                ++acCount;
                acQ.add(qn);
            }
            else
            {
                if (aw.equals("WA") && !(acQ.contains(qn)))
                {
                    if (waCount.get(qn) == null)
                    {
                        //System.out.println(2);
                        waCount.put(qn, 1);
                    }
                    else
                    {
                        //System.out.println(3);
                        int tmp = waCount.get(qn);
                        ++tmp;
                        waCount.put(qn,tmp);
                    }
                }
            }
        }

        int waSum = 0;
        for (int i:waCount.keySet())
        {
            int tmp = waCount.get(i);
            waSum += tmp;
        }

        System.out.println(acCount+" "+waSum);
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