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
		if(N == 1){
			myout(1);
			return;
		}
		Node[] list = new Node[N];
		for(int i = 0; i < N; i++){
			ArrayList<Integer> tmp = nextIntArray();
			list[i] = new Node(tmp.get(0), tmp.get(1));
		}
		int output = 99;
		for(int i = 0; i < N - 1; i++){
			for(int j = i + 1; j < N; j++){
				int diffX = list[i].x - list[j].x;
				int diffY = list[i].y - list[j].y;
				UnionFind uf = new UnionFind(N);
				for(int k = 0; k < N; k++){
					for(int l = 0; l < N; l++){
						if(k != l){
							if(list[k].x - list[l].x == diffX && list[k].y - list[l].y == diffY){
								uf.doUnion(k, l);
							}
						}
					}
				}
				int count = 0;
				for(int k = 0; k < N; k++){
					if(uf.list[k] < 0){
						count++;
					}
				}
				output = Math.min(output, count);
			}
		}
		myout(output);
	}
	//Method addition frame start

static class Node{
	int x;
	int y;
	Node(int x, int y){
		this.x = x;
		this.y = y;
	}
}

static class UnionFind{
  int[] list;
  UnionFind(int size){
    list = new int[size];
    for(int i = 0; i < size; i++){
      list[i] = -1;
    }
  }
  boolean isSame(int mae, int ato){
    return getRootIndex(mae) == getRootIndex(ato);
  }
  int getRootIndex(int index){
    if(list[index] < 0){
      return index;
    }else{
      list[index] = getRootIndex(list[index]);
      return list[index];
    }
  }
  void doUnion(int mae, int ato){
    int maeRoot = getRootIndex(mae);
    int atoRoot = getRootIndex(ato);
    if(!isSame(maeRoot, atoRoot)){
      if(maeRoot >= atoRoot){
        list[maeRoot] += list[atoRoot];
        list[atoRoot] = maeRoot;
      }else{
        list[atoRoot] += list[maeRoot];
        list[maeRoot] = atoRoot;
      }
    }
  }
  int getSize(int index){
    return -list[getRootIndex(index)];
  }
}

	//Method addition frame end
}
