import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.util.PriorityQueue;
import java.util.InputMismatchException;
import java.io.FileInputStream;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractCollection;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author jasonsun0310
 */
public class Main {
	public static void main(String[] args)
	{
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		OutputWriter out = new OutputWriter(outputStream);
		E solver = new E();
		solver.solve(1, in, out);
		out.close();
	}

	static @SuppressWarnings("ALL")
	class E {
		private static final int          MOD          = (int) (1e9+7);
		private static final int          MAXN         = 100000+5;
		private              long[]       distS        = new long[MAXN];
		private              long[]       distT        = new long[MAXN];
		private              int[]        waysS        = new int[MAXN];
		private              int[]        waysT        = new int[MAXN];
		private              int[]        waysShortest = new int[MAXN];
		private              List<Edge>[] edges        = new List[MAXN];
		private int n;
		private int s;
		private int t;
		private int m;

		public void solve(int testNumber, InputReader in, OutputWriter out)
		{
			initialize(in, out);
			dijkstra(s, edges, distS, waysS);
			dijkstra(t, edges, distT, waysT);
			out.printLine(count());
		}

		private long count()
		{
			for(int i = 0; i < n; i++)
			{
				if(distS[i]+distT[i] != distS[t]) continue;
				waysShortest[i] = (int) ((long) waysS[i]*waysT[i]%MOD);
			}

			long ans = (long) waysShortest[t]*waysShortest[t]%MOD;
			for(int i = 0; i < n; i++)
			{
				if(distS[i]+distT[i] != distS[t]) continue;
				if(distS[i] == distT[i])
				{
					ans = (ans-(long) waysShortest[i]*waysShortest[i])%MOD;
					if(ans < 0) ans += MOD;
				}
			}
			// Do not meet on an edge.
			for(int i = 0; i < n; i++)
			{
				for(Edge e : edges[i])
				{
					int j = e.dst;
					if(distS[i]+e.length+distT[j] != distS[t])
						continue;
					long l1 = distS[i], r1 = distS[j];
					long l2 = distT[j], r2 = distT[i];
					if(Math.max(l1, l2) < Math.min(r1, r2))
					{
						long cur = (long) waysS[i]*waysT[j]%MOD*waysS[i]%MOD*waysT[j]%MOD;
						ans -= cur;
						if(ans < 0) ans += MOD;
					}
				}
			}
			return ans;
		}

		private void initialize(InputReader in, OutputWriter out)
		{
			n = in.readInt();
			m = in.readInt();
			s = in.readInt()-1;
			t = in.readInt()-1;
			ArrayUtils.fill(edges, ArrayUtils.range(0, n), () -> new ArrayList<>());
			ArrayUtils.fill(distS, 0, n, 0); ArrayUtils.fill(distT, 0, n, 0);
			ArrayUtils.fill(waysS, 0, n, 0); ArrayUtils.fill(waysT, 0, n, 0);
			ArrayUtils.fill(waysShortest, 0, n, 0);
			for(int i = 0; i < m; i++)
			{
				int a = in.readInt()-1;
				int b = in.readInt()-1;
				int c = in.readInt();
				edges[a].add(new Edge(b, c));
				edges[b].add(new Edge(a, c));
			}
		}

		private long[] dijkstra(int s, List<Edge>[] edges, long[] dist, int[] ways)
		{
			final long infinity = Long.MAX_VALUE/2;
			Arrays.fill(dist, infinity);
			dist[s] = 0;
			ways[s] = 1;
			PriorityQueue<Vertex> pq = new PriorityQueue<>();
			pq.offer(new Vertex(s, 0));
			while(!pq.isEmpty())
			{
				Vertex ver = pq.poll();
				int v = ver.v;
				if(ver.dist != dist[v]) continue;
				for(Edge e : edges[v])
				{
					int u = e.dst;
					if(dist[u] > dist[v]+e.length)
					{
						dist[u] = dist[v]+e.length;
						ways[u] = ways[v];
						pq.offer(new Vertex(u, dist[u]));
					}
					else if(dist[u] == dist[v]+e.length)
					{
						ways[u] += ways[v];
						if(ways[u] >= MOD) ways[u] -= MOD;
					}
				}
			}
			return dist;
		}

		class Vertex implements Comparable<Vertex> {
			int  v;
			long dist;

			Vertex(int v, long dist)
			{
				this.v = v;
				this.dist = dist;
			}

			public int compareTo(Vertex o)
			{
				if(dist != o.dist)
				{
					return dist < o.dist ? -1 : 1;
				}
				return 0;
			}
		}

		class Edge {
			int dst;
			int length;

			Edge(int dst, int length)
			{
				this.dst = dst;
				this.length = length;
			}
		}
	}

	static @SuppressWarnings("ALL")
	class InputReader {
		final private int BUFFER_SIZE = 1<<16;
		private BufferedInputStream din;
		private byte[]              buffer;
		private int                 bufferPointer;
		private int                 bytesRead;

		public InputReader(InputStream stream)
		{
			din = new BufferedInputStream(stream);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public InputReader(String file_name)
		{
			try
			{
				din = new BufferedInputStream(new FileInputStream(file_name));
			} catch(Exception e)
			{
				throw new InputMismatchException();
			}
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public int readInt()
		{
			int ret = 0;
			byte c = read();
			while(c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if(neg)
				c = read();
			do
			{
				ret = ret*10+c-'0';
			} while((c = read()) >= '0' && c <= '9');

			if(neg)
				return -ret;
			return ret;
		}

		private void fillBuffer()
		{
			try
			{
				bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			} catch(Exception e)
			{
				throw new InputMismatchException();
			}
			if(bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read()
		{
			if(bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}
	}

	static @SuppressWarnings("ALL")
	class ArrayUtils {
		public static int[] range(int a, int b)
		{
			return new int[]{a, b};
		}

		public static void fill(int[] arr, int from, int to, int val)
		{
			int len = to-from+1;
			arr[from] = val;
			for(int i = 1; i < len; i += i)
				System.arraycopy(arr, from, arr, from+i, ((len-i) < i) ? (len-i) : i);
		}

		public static void fill(long[] arr, int from, int to, long val)
		{
			int len = to-from+1;
			arr[from] = val;
			for(int i = 1; i < len; i += i)
				System.arraycopy(arr, from, arr, from+i, ((len-i) < i) ? (len-i) : i);
		}

		public static <T> void fill(List<T>[] list, int[] rangeDim1, Supplier<List<T>> function)
		{
			for(int i = rangeDim1[0]; i <= rangeDim1[1]; i++)
				list[i] = function.get();
		}
	}

	static class OutputWriter {
		private final PrintWriter writer;

		public OutputWriter(OutputStream outputStream)
		{
			writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
		}

		public OutputWriter(Writer writer)
		{
			this.writer = new PrintWriter(writer);
		}

		public void close()
		{
			writer.close();
		}

		public void printLine(long i)
		{
			writer.println(i);
		}
	}
}