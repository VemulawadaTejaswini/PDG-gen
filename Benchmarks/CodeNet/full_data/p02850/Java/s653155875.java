import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer>[] list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		list = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<Integer>();
		}
		ArrayList<Eda> eda = new ArrayList<Eda>();
		for (int i = 1; i <= N - 1; i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			list[a].add(b);
			list[b].add(a);
			eda.add(new Eda(a, b));
		}

		sc.close();

		HashMap<Eda, Integer> map = new HashMap<Eda, Integer>();

		int[] color = new int[N + 1];
		Boolean[] flag = new Boolean[N + 1];
		for (int i = 0; i <= N; i++)
			flag[i] = false;
		Queue<Integer> Q = new ArrayDeque<>();
		flag[1] = true;
		Q.add(1);
		while (!Q.isEmpty()) {
			int v = Q.poll();
			//			System.out.println(v);
			int ncolor = 1;
			for (int i : list[v]) {
				//				System.out.println(i);
				//				System.out.println(flag[i]);
				if (!flag[i]) {
					if (ncolor == color[v])
						ncolor++;
					color[i] = ncolor;
					map.put(new Eda(Math.min(v, i), Math.max(v, i)), ncolor);
					//					System.out.println(key[0] + ", " + key[1]);
					//					System.out.println(ncolor);
					ncolor++;
					flag[i] = true;
					Q.add(i);
				}
			}
		}


		int colorNum = 0;
		for (Eda e : eda) {
			colorNum = Math.max(map.get(e), colorNum);
		}
		System.out.println(colorNum);
		for (Eda e : eda) {
			System.out.println(map.get(e));
		}

	}

	private static class Eda {
		int n1;
		int n2;

		public Eda(int n1, int n2) {
			this.n1 = n1;
			this.n2 = n2;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + n1;
			result = prime * result + n2;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Eda other = (Eda) obj;
			if (n1 != other.n1)
				return false;
			if (n2 != other.n2)
				return false;
			return true;
		}

//		private D getEnclosingInstance() {
//			return D.this;
//		}

	}

}

//import java.io.IOException;
//import java.io.InputStream;
//import java.util.NoSuchElementException;
//
//class FastScanner {
//  private final InputStream in = System.in;
//  private final byte[] buffer = new byte[1024];
//  private int ptr = 0;
//  private int buflen = 0;
//  private boolean hasNextByte() {
//      if (ptr < buflen) {
//          return true;
//      }else{
//          ptr = 0;
//          try {
//              buflen = in.read(buffer);
//          } catch (IOException e) {
//              e.printStackTrace();
//          }
//          if (buflen <= 0) {
//              return false;
//          }
//      }
//      return true;
//  }
//  private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
//  private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
//  public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
//  public String next() {
//      if (!hasNext()) throw new NoSuchElementException();
//      StringBuilder sb = new StringBuilder();
//      int b = readByte();
//      while(isPrintableChar(b)) {
//          sb.appendCodePoint(b);
//          b = readByte();
//      }
//      return sb.toString();
//  }
//  public long nextLong() {
//      if (!hasNext()) throw new NoSuchElementException();
//      long n = 0;
//      boolean minus = false;
//      int b = readByte();
//      if (b == '-') {
//          minus = true;
//          b = readByte();
//      }
//      if (b < '0' || '9' < b) {
//          throw new NumberFormatException();
//      }
//      while(true){
//          if ('0' <= b && b <= '9') {
//              n *= 10;
//              n += b - '0';
//          }else if(b == -1 || !isPrintableChar(b)){
//              return minus ? -n : n;
//          }else{
//              throw new NumberFormatException();
//          }
//          b = readByte();
//      }
//  }
//  public int nextInt() {
//      long nl = nextLong();
//      if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
//      return (int) nl;
//  }
//  public double nextDouble() { return Double.parseDouble(next());}
//}
