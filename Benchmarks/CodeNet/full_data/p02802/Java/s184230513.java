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
        int waCount = 0;
        int acCount = 0;
        for (int i = 0;i<m;++i)
        {
            int qn = questionNum.get(i);
            String aw = acwa.get(i);

            if (aw.equals("AC") && !(acQ.contains(qn)))
            {
                ++acCount;
                acQ.add(qn);
            }
            else if (aw.equals("WA"))
            {
                if (!acQ.contains(qn)) ++waCount;
            }
        }

        System.out.println(acQ.size()+" "+waCount);
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