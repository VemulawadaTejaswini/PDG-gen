import java.util.*;

public class Main
{
    private final Map<Long, Vertex> vertices = new HashMap<Long, Vertex>();
    private final Map<Long, List<Long>> edges = new HashMap<Long, List<Long>>();
    private final int N, K;

    Diameter(String input)
    {
        String[] lines = input.split("\n");
        String[] NandK = lines[0].split(" ");

        N = Integer.parseInt(NandK[0]);
        K = Integer.parseInt(NandK[1]);

        for (int i = 1; i < N; i++)
        {
            String[] edgeInfo = lines[i].split(" ");
            long fromVindex = Long.parseLong(edgeInfo[0]);
            long toVindex = Long.parseLong(edgeInfo[1]);

            if (!edges.containsKey(fromVindex))
                edges.put(fromVindex, new ArrayList<Long>());

            if (!edges.containsKey(toVindex))
                edges.put(toVindex, new ArrayList<Long>());

            if (!vertices.containsKey(fromVindex))
                vertices.put(fromVindex, new Vertex(fromVindex));

            if (!vertices.containsKey(toVindex))
                vertices.put(toVindex, new Vertex(toVindex));

            edges.get(fromVindex).add(toVindex);
            edges.get(toVindex).add(fromVindex);
        }
    }

    private class Vertex
    {
        final long vindex;

        Vertex(long vindex)
        {
            this.vindex = vindex;
        }

        List<Long> getNeighbours(Long exceptVertext)
        {
            List<Long> result = new ArrayList<Long>(edges.get(vindex));
            result.remove(exceptVertext);
            return result;
        }

        public String toString()
        {
            return Long.toString(vindex);
        }

        public int countVerticesAround(int D)
        {
            if (D == 0)
                return 1;

            if (D == 1)
                return Math.min(vertices.size(), 2);

            int R = D / 2;

            int resultForD = recursiveCount(R, null);
            if (D % 2 == 1)
            {
                int maxExtra = 0;
                for (long n : getNeighbours(null))
                {
                    int currExtra = vertices.get(n).recursiveCountAt(R, 0, vindex);
                    maxExtra = Math.max(currExtra, maxExtra);
                }

                resultForD += maxExtra;
            }

            return resultForD ;
        }

        private int recursiveCount(long maxR, Long from)
        {
            List<Long> ns = getNeighbours(from);

            if (maxR == 0)
                return 1;

            int result = 1;
            for (Long n : ns)
                result += vertices.get(n).recursiveCount(maxR - 1, vindex);

            return result;
        }

        private int recursiveCountAt(final long max, long curr, Long from)
        {
            int result = 0;

            if (curr == max)
                return 1;

            for (Long n : getNeighbours(from))
                result += vertices.get(n).recursiveCountAt(max, curr + 1, vindex);

            return result;
        }
    }

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int d = sc.nextInt();
      String sampleInput = n + " " +d +"\n";
      for (int i = 0; i<n-1;i++){
        String a = sc.next();
        String b= sc.next();
        sampleInput = sampleInput + a+" "+b+"\n";
      }

        new Diameter(sampleInput).solve();
    }

    public int solve()
    {
        int result = Integer.MAX_VALUE;
        for (Vertex vertex : vertices.values())
        {
            int numVerticesToRatain = vertex.countVerticesAround(K);
            result = Math.min(result, vertices.size() - numVerticesToRatain);
        }

        System.out.println(result);

        return result;
    }
}
