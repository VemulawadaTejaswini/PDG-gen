import java.util.*; import java.io.*; import java.math.*;
public class Main{
	static void solve(){//Here is the main function
		ArrayList<Integer> one = nextIntArray();
		int H = one.get(0);
		int W = one.get(1);
		Node[][] list = new Node[H][W];
		for(int i = 0; i < H; i++){
			ArrayList<String> tmp = nextCharArray();
			for(int j = 0; j < W; j++){
				list[i][j] = new Node(tmp.get(j));
			}
		}
		ArrayDeque<Q> queue = new ArrayDeque<>();
		queue.add(new Q(0,0));
		list[0][0].access = true;
		list[0][0].count = 1;
		int mod = 1000000007;
		int[] dy = {1, 0};
		int[] dx = {0, 1};
		while(queue.size() > 0){
			Q now = queue.pollFirst();
			int nowY = now.y;
			int nowX = now.x;
			for(int i = 0; i < 2; i++){
				int nextY = nowY + dy[i];
				int nextX = nowX + dx[i];
				try{
					if(list[nextY][nextX].s.equals(".") && !list[nextY][nextX].access){
						long add = list[nowY][nowX].count;
						if(i == 0 && nextX > 0){
							add += list[nextY][nextX - 1].count;
						}else if(i == 1 && nextY > 0){
							add += list[nextY - 1][nextX].count;
						}
						list[nextY][nextX].count = add % mod;
						list[nextY][nextX].access = true;
						queue.add(new Q(nextY, nextX));
					}
				}catch(Exception e){}
			}
		}
		myout(list[H - 1][W - 1].count);
	}
	//Method addition frame start

static class Q{
	int y;
	int x;
	Q(int y, int x){
		this.y = y;
		this.x = x;
	}
}

static class Node{
	long count = 0;
	boolean access = false;
	String s;
	Node(String s){
		this.s = s;
	}
}

	//Method addition frame end

	//Don't have to see. start------------------------------------------
	static class InputIterator{
		ArrayList<String> inputLine = new ArrayList<String>(1024);
		int index = 0; int max; String read;
		InputIterator(){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try{
				while((read = br.readLine()) != null){
					inputLine.add(read);
				}
			}catch(IOException e){}
			max = inputLine.size();
		}
		boolean hasNext(){return (index < max);}
		String next(){
			if(hasNext()){
				return inputLine.get(index++);
			}else{
				throw new IndexOutOfBoundsException("There is no more input");
			}
		}
	}
	static HashMap<Integer, String> CONVSTR = new HashMap<Integer, String>();
	static InputIterator ii = new InputIterator();//This class cannot be used in reactive problem.
	static PrintWriter out = new PrintWriter(System.out);
	static void flush(){out.flush();}
	static void myout(Object t){out.println(t);}
	static void myerr(Object t){System.err.print("debug:");System.err.println(t);}
	static String next(){return ii.next();}
	static boolean hasNext(){return ii.hasNext();}
	static int nextInt(){return Integer.parseInt(next());}
	static long nextLong(){return Long.parseLong(next());}
	static double nextDouble(){return Double.parseDouble(next());}
	static ArrayList<String> nextStrArray(){return myconv(next(), 8);}
	static ArrayList<String> nextCharArray(){return myconv(next(), 0);}
	static ArrayList<Integer> nextIntArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Integer> ret = new ArrayList<Integer>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Integer.parseInt(input.get(i)));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<Long>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Long.parseLong(input.get(i)));
		}
		return ret;
	}
	static String myconv(Object list, int no){//only join
		String joinString = CONVSTR.get(no);
		if(list instanceof String[]){
			return String.join(joinString, (String[])list);
		}else if(list instanceof ArrayList){
			return String.join(joinString, (ArrayList)list);
		}else{
			throw new ClassCastException("Don't join");
		}
	}
	static ArrayList<String> myconv(String str, int no){//only split
		String splitString = CONVSTR.get(no);
		return new ArrayList<String>(Arrays.asList(str.split(splitString)));
	}
	public static void main(String[] args){
		CONVSTR.put(8, " "); CONVSTR.put(9, "\n"); CONVSTR.put(0, "");
		solve();flush();
	}
	//Don't have to see. end------------------------------------------
}
