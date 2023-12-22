
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

        return e2.len + trace(Direction.FLT, v3);
    }

    static long trace(Direction inboundDirection, Vertex fromVertex)
    {
        long result = 0;
        while(true)
        {
            Direction reflectedDirection = fromVertex.out.reflect(inboundDirection);
            // Form a triangle..
            if (fromVertex.getNextClockwiseEdge().dir != reflectedDirection && fromVertex.getNextClockwiseEdge().len > fromVertex.out.len)
            {
                // Triangle is formed from clockwise rotation
                long triangleSideLegth = fromVertex.out.len;
                Vertex newVertex = new Vertex();
                fromVertex.getNextClockwiseEdge().setFrom(newVertex);
                fromVertex.getNextClockwiseEdge().len = fromVertex.getNextClockwiseEdge().len - triangleSideLegth;
                fromVertex.out = new Edge(fromVertex, newVertex, triangleSideLegth, reflectedDirection);
                result += triangleSideLegth;
                fromVertex = newVertex;
                inboundDirection = reflectedDirection;
            }
            else if (fromVertex.getNextCounterClockwiseEdge().dir != reflectedDirection && fromVertex.getNextCounterClockwiseEdge().len > fromVertex.in.len)
            {
                // Triangle is formed from counterclockwise rotation
                // Reverse the graph..
                fromVertex.in.reverseGraph();
                long triangleSideLegth = fromVertex.out.len;
                Vertex newVertex = new Vertex();
                fromVertex.getNextClockwiseEdge().setFrom(newVertex);
                fromVertex.getNextClockwiseEdge().len = fromVertex.getNextClockwiseEdge().len - triangleSideLegth;
                fromVertex.out = new Edge(fromVertex, newVertex, triangleSideLegth, reflectedDirection);
                result += triangleSideLegth;
                fromVertex = newVertex;
                inboundDirection = reflectedDirection;
            } else
            {
                // Need to double check that this is correct
                if (fromVertex.getNextCounterClockwiseEdge().len == fromVertex.getNextClockwiseEdge().len)
                {
                    result += fromVertex.getNextCounterClockwiseEdge().len;
                    break;
                }
                else
                    throw new RuntimeException("WhatTheHackException");
            }
        }

        return result;
    }
}
