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
	static InputIterator ii = new InputIterator();//This class cannot be used in reactive problem.
	static PrintWriter out = new PrintWriter(System.out);
	static void flush(){out.flush();}
	static void myout(Object t){out.println(t);}
	static void myerr(Object t){System.err.print("debug:");System.err.println(t);}
	static String next(){return ii.next();}
	static boolean hasNext(){return ii.hasNext();}
	static int nextInt(){return Integer.parseInt(next());}
	static long nextLong(){return Long.parseLong(next());}
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
	static HashMap<Integer, String> CONVSTR = new HashMap<Integer, String>();
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
		Runtime rt = Runtime.getRuntime();
		long mae = System.currentTimeMillis();
		solve();flush();
		long ato = System.currentTimeMillis();
		myerr("time : " + (ato - mae) + "ms");
		myerr("memory : " + ((rt.totalMemory() - rt.freeMemory()) / 1024) + "KB");
	}
	//Don't have to see. end------------------------------------------
	static void solve(){//Here is the main function
		int N = nextInt();
		ArrayList<Long> alist = nextLongArray();
		ArrayList<Long> blist = nextLongArray();
		PriorityQueue<Long[]> pq = new PriorityQueue<Long[]>(new OriginComparator());
		for(int i = 0; i < N; i++){
			if(alist.get(i) != blist.get(i)){
				Long[] tmp = new Long[2];
				tmp[0] = (long)i;
				tmp[1] = blist.get(i);
				pq.add(tmp);
			}
		}
		long output = 0;
		boolean isOK = true;
		while(!pq.isEmpty()){
			Long[] now = pq.poll();
			int index = Integer.parseInt(String.valueOf(now[0]));
			int mae = (index - 1 + N) % N;
			int ato = (index + 1) % N;
			if(blist.get(index) - alist.get(index) < blist.get(mae) + blist.get(ato)){
				isOK = false;
				break;
			}
			long count = (blist.get(index) - alist.get(index)) / (blist.get(mae) + blist.get(ato));
			blist.set(index, blist.get(index) - (blist.get(mae) + blist.get(ato)) * count);
			output += count;
			if(blist.get(index) != alist.get(index)){
				Long[] tmp = new Long[2];
				tmp[0] = (long)index;
				tmp[1] = blist.get(index);
				pq.add(tmp);
			}
		}
		myout((isOK) ? output : -1);
	}
	//Method addition frame start
public static class OriginComparator implements Comparator<Long[]>{
  public int compare(Long[] mae, Long[] ato){
  	if(ato[1] > mae[1]){
  		return 1;
  	}else if(ato[1] < mae[1]){
  		return -1;
  	}else{
  		return 0;
  	}
  }
}
	//Method addition frame end
}
