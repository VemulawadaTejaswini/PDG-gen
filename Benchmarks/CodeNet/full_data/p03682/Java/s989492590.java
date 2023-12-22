 static ArrayList<Edge> edges = new ArrayList<>();

    public static void addEdge(int f, int t, long c)
    {
        edges.add(new Edge(f, t, c));
    }


    static class Edge implements Comparable<Edge>
    {
        int f;
        int t;
        long toCost;

        Edge(int f, int to, long cost)
        {
            this.f = f;
            t = to;
            toCost = cost;
        }

        @Override
        public int compareTo(Edge e)
        {
            return toCost == e.toCost ? 0 : toCost > e.toCost ? 1 : -1;
        }

    }
