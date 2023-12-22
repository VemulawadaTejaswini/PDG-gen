
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
            Edge nextEdge = to.out;
            Vertex origFrom = this.from;
            this.from = this.to;
            this.to = origFrom;

            this.to.in = this;
            this.from.out = this;

            if (nextEdge.to != this.from)
                nextEdge.reverseGraph();
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

        return e2.len + v3.trace(Direction.FLT);
    }
}
