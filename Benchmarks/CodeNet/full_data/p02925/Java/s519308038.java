import java.util.*; import java.io.*; import java.math.*;
public class Main{
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
	static ArrayDeque<String> queue = new ArrayDeque<String>();
	static Node[] list;
	static int N;
	static void solve(){//Here is the main function
		N = nextInt();
		list = new Node[N];
		for(int i = 0; i < N; i++){
			ArrayList<Integer> tmp = nextIntArray();
			int[] add = new int[N - 1];
			for(int j = 0; j < N - 1; j++){
				add[j] = tmp.get(j) - 1;
			}
			list[i] = new Node(add);
		}
		int output = 0;
		for(int i = 0; i < N; i++){
			check(i);
		}
		while(queue.size() > 0){
			ArrayDeque<String> tmpQueue = (ArrayDeque<String>)queue.clone();
			queue = new ArrayDeque<String>();
			output++;
			while(tmpQueue.size() > 0){
				String tmp = tmpQueue.pollFirst();
				int L = Integer.parseInt(tmp.split(":")[0]);
				int R = Integer.parseInt(tmp.split(":")[1]);
				list[L].lastIndex++;
				list[R].lastIndex++;
				check(L);
				check(R);
			}
		}
		for(int i = 0; i < N; i++){
			if(list[i].lastIndex != N - 1){
				output = -1;
			}
		}
		myout(output);
	}
	//Method addition frame start

static class Node{
	int[] next;
	int lastIndex = 0;
	Node(int[] n){
		next = n;
	}
}

static void check(int left){
	if(list[left].lastIndex == N - 1){
		return;
	}
	int right = list[left].next[list[left].lastIndex];
	if(list[right].lastIndex == N - 1){
		return;
	}
	if(list[right].next[list[right].lastIndex] == left){
		if(right < left){
			int tmp = left;
			left = right;
			right = tmp;
		}
		if(!queue.contains(left + ":" + right)){
			String add = left + ":" + right;
			queue.addLast(add);
		}
	}
}

	//Method addition frame end
}
