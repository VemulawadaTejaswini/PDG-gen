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
	static void solve(){//Here is the main function
		int N = nextInt();
		Node[] list = new Node[N];
		for(int i = 0; i < N; i++){
			list[i] = new Node();
		}
		for(int i = 0; i < N - 1; i++){
			ArrayList<Integer> tmp = nextIntArray();
			list[tmp.get(0) - 1].child.add(tmp.get(1) - 1);
			list[tmp.get(1) - 1].child.add(tmp.get(0) - 1);
		}
		ArrayList<Integer> c = nextIntArray();
		Collections.sort(c);
		int tooi = -1;
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		queue.add(0);
		list[0].access = true;
		while(queue.size() > 0){
			int now = queue.pollFirst();
			ArrayList<Integer> child = list[now].child;
			for(int i = 0; i < child.size(); i++){
				if(!list[child.get(i)].access){
					list[child.get(i)].access = true;
					tooi = child.get(i);
					queue.addLast(child.get(i));
				}
			}
		}
		for(int i = 0; i < N; i++){
			list[i].access = false;
		}
		queue.add(tooi);
		list[tooi].access = true;
		list[tooi].val = c.get(c.size() - 1);
		c.remove(c.size() - 1);
		long sum = 0;
		while(queue.size() > 0){
			int now = queue.pollFirst();
			ArrayList<Integer> child = list[now].child;
			for(int i = 0; i < child.size(); i++){
				if(!list[child.get(i)].access){
					list[child.get(i)].access = true;
					list[child.get(i)].val = c.get(c.size() - 1);
					c.remove(c.size() - 1);
					sum += list[child.get(i)].val;
					queue.addLast(child.get(i));
				}
			}
		}
		myout(sum);
		String[] output = new String[N];
		for(int i = 0; i < N; i++){
			output[i] = String.valueOf(list[i].val);
		}
		myout(myconv(output, 8));
	}
	//Method addition frame start

static class Node{
	ArrayList<Integer> child = new ArrayList<Integer>();
	boolean access = false;
	int val = -1;
	Node(){}
}

	//Method addition frame end
}
