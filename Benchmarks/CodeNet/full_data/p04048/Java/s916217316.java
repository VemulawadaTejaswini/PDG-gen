
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Scanner;
public class Main
{
    private enum Direction
    {
        FLT, ASC, DSC
    }

    private static class Vertex
    {
        static AtomicLong counter = new AtomicLong(0);
        final long index = counter.incrementAndGet();

        Edge in;
        Edge out;

        long trace(Direction inboundDirection)
        {
            long result = 0;
            Direction reflectedDirection = this.out.reflect(inboundDirection);

            if (getNextCounterClockwiseEdge().dir == this.out.dir && getNextCounterClockwiseEdge().len > this.in.len)
            {
                long triangleSideLength = this.in.len;
                // Can take a big shortcut here
                int numShortcutTriangles = (int)((getNextCounterClockwiseEdge().len - triangleSideLength) / triangleSideLength);
                if (numShortcutTriangles > 2)
                {
                    // Take the shortcut
                    result += ((2 * (numShortcutTriangles - 1) * triangleSideLength));
                    getNextCounterClockwiseEdge().len -= (((numShortcutTriangles - 1) * triangleSideLength));
                    this.out.len -= (((numShortcutTriangles - 1) * triangleSideLength));

                    if (reflectedDirection != getNextClockwiseEdge().dir)
                        this.out.len += triangleSideLength;
                }
            }

            // Form a triangle..
            if (getNextClockwiseEdge().dir != reflectedDirection && getNextClockwiseEdge().len > this.out.len)
            {
                if (getNextClockwiseEdge().dir == this.out.dir)
                {
                    // Can take a big shortcut here
                    int x = 0;
                    x++;
                }

                // Triangle is formed from clockwise rotation
                long triangleSideLegth = this.out.len;
                Vertex newVertex = new Vertex();
                getNextClockwiseEdge().setFrom(newVertex);
                getNextClockwiseEdge().len = getNextClockwiseEdge().len - triangleSideLegth;
                this.out = new Edge(this, newVertex, triangleSideLegth, reflectedDirection);
                result += triangleSideLegth;
                result += newVertex.trace(reflectedDirection);
            }
            else if (getNextCounterClockwiseEdge().dir != reflectedDirection && getNextCounterClockwiseEdge().len > this.in.len)
            {
                long triangleSideLength = this.in.len;
                // Triangle is formed from counterclockwise rotation
                // Reverse the graph..
                this.in.reverseGraph();
                Vertex newVertex = new Vertex();
                getNextClockwiseEdge().setFrom(newVertex);
                getNextClockwiseEdge().len = getNextClockwiseEdge().len - triangleSideLength;
                this.out = new Edge(this, newVertex, triangleSideLength, reflectedDirection);
                result += triangleSideLength;
                result += newVertex.trace(reflectedDirection);
            }
            else
            {
                // Need to double check that this is correct
                if (getNextCounterClockwiseEdge().len == getNextClockwiseEdge().len)
                    return getNextCounterClockwiseEdge().len;
                else
                    throw new RuntimeException("WhatTheHackException");
            }

            return result;
        }

        Edge getNextClockwiseEdge()
        {
            return out.to.out;
        }

        Edge getNextCounterClockwiseEdge()
        {
            return in.from.in;
        }

        public String toString()
        {
            return Long.toString(index);
        }
    }

    private static class Edge
    {
        static AtomicInteger counter = new AtomicInteger(0);
        final int index = counter.incrementAndGet();
        Vertex from;
        Vertex to;
        long len;
        Direction dir;

        public Edge(Vertex f, Vertex t, long len, Direction direction)
        {
            this.from = f;
            this.from.out = this;
            this.to = t;
            this.to.in = this;
            this.len = len;
            this.dir = direction;
        }

        void setTo(Vertex to)
        {
            this.to = to;
            this.to.in = this;
        }

        void setFrom(Vertex from)
        {
            this.from = from;
            this.from.out = this;
        }

        Direction reflect(Direction direction)
        {
            if (this.dir == Direction.FLT)
            {
                if (direction == Direction.ASC)
                    return Direction.DSC;
                else if (direction == Direction.DSC)
                    return Direction.ASC;
                else
                    throw new IllegalArgumentException("Kwap");
            }
            else if (this.dir == Direction.ASC)
            {
                if (direction == Direction.FLT)
                    return Direction.DSC;
                else if (direction == Direction.DSC)
                    return Direction.FLT;
                else
                    throw new IllegalArgumentException("Kwap");
            }
            else if (this.dir == Direction.DSC)
            {
                if (direction == Direction.FLT)
                    return Direction.ASC;
                else if (direction == Direction.ASC)
                    return Direction.DSC;
                else
                    throw new IllegalArgumentException("Kwap");
            }
            else
                throw new IllegalArgumentException("Kwap");
        }

        void reverseGraph()
        {
            Edge currentEdge = this;

            while(true)
            {
                Edge nextEdge = currentEdge.to.out;
                Vertex origFrom = currentEdge.from;
                currentEdge.from = currentEdge.to;
                currentEdge.to = origFrom;

                currentEdge.to.in = currentEdge;
                currentEdge.from.out = currentEdge;

                if (nextEdge.to != currentEdge.from)
                    currentEdge = nextEdge;
                else
                    break;
            }
        }

        public String toString()
        {
            return Long.toString(index);
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long x = scan.nextLong();
        System.out.println(getRayLength(x,n)); 
    }

    private static long getRayLength(long X, long N)
    {
        Vertex v1 = new Vertex();
        Vertex v2 = new Vertex();
        Vertex v3 = new Vertex();
        Vertex v4 = new Vertex();

        Edge e1 = new Edge(v1, v2, N - X, Direction.ASC);
        Edge e2 = new Edge(v2, v3, X, Direction.FLT);
        Edge e3 = new Edge(v3, v4, N - X, Direction.DSC);
        Edge e4 = new Edge(v4, v1, N, Direction.FLT);

        return e2.len + trace(Direction.FLT, v3);
    }

    static long trace(Direction inboundDirection, Vertex fromVertex)
    {
        long result = 0;
        while(true)
        {
            Direction reflectedDirection = fromVertex.out.reflect(inboundDirection);

            if (fromVertex.getNextCounterClockwiseEdge().dir == fromVertex.out.dir && fromVertex.getNextCounterClockwiseEdge().len > fromVertex.in.len)
            {
                long triangleSideLength = fromVertex.in.len;
                // Can take a big shortcut here
                long numShortcutTriangles = ((fromVertex.getNextCounterClockwiseEdge().len - triangleSideLength) / triangleSideLength);
                if (numShortcutTriangles > 2)
                {
                    // Take the shortcut
                    result += ((2 * (numShortcutTriangles - 1) * triangleSideLength));
                    fromVertex.getNextCounterClockwiseEdge().len -= (((numShortcutTriangles - 1) * triangleSideLength));
                    fromVertex.out.len -= (((numShortcutTriangles - 1) * triangleSideLength));

                    if (reflectedDirection != fromVertex.getNextClockwiseEdge().dir)
                        fromVertex.out.len += triangleSideLength;
                }
            }

            // Form a triangle..
            if (fromVertex.out.to.out.dir != reflectedDirection && fromVertex.out.to.out.len > fromVertex.out.len)
            {
                if (fromVertex.getNextClockwiseEdge().dir == fromVertex.out.dir)
                {
                    // Can take a big shortcut here
                    int x = 0;
                    x++;
                }

                // Triangle is formed from clockwise rotation
                long triangleSideLegth = fromVertex.out.len;
                Vertex newVertex = new Vertex();
                fromVertex.out.to.out.setFrom(newVertex);
                fromVertex.out.to.out.len = fromVertex.out.to.out.len - triangleSideLegth;
                fromVertex.out = new Edge(fromVertex, newVertex, triangleSideLegth, reflectedDirection);
                result += triangleSideLegth;
                fromVertex = newVertex;
                inboundDirection = reflectedDirection;
            }
            else if (fromVertex.in.from.in.dir != reflectedDirection && fromVertex.in.from.in.len > fromVertex.in.len)
            {
                // Triangle is formed from counterclockwise rotation
                // Reverse the graph..
                fromVertex.in.reverseGraph();
                long triangleSideLegth = fromVertex.out.len;
                Vertex newVertex = new Vertex();
                fromVertex.out.to.out.setFrom(newVertex);
                fromVertex.out.to.out.len = fromVertex.out.to.out.len - triangleSideLegth;
                fromVertex.out = new Edge(fromVertex, newVertex, triangleSideLegth, reflectedDirection);
                result += triangleSideLegth;
                fromVertex = newVertex;
                inboundDirection = reflectedDirection;
            } else
            {
                // Need to double check that this is correct
                if (fromVertex.in.from.in.len == fromVertex.out.to.out.len)
                {
                    result += fromVertex.in.from.in.len;
                    break;
                }
                else
                    throw new RuntimeException("WhatTheHackException");
            }
        }

        return result;
    }
}
