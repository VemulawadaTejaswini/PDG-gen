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
  ArrayDeque<Integer> list = new ArrayDeque<Integer>();
  int[] tmp = new int[N];
  for(int i = 0; i < N; i++){
    tmp[i] = nextInt();
  }
  Arrays.sort(tmp);
  for(int i = 0; i < N; i++){
    list.addLast(tmp[i]);
  }
  ArrayList<Integer> plus = new ArrayList<Integer>();
  ArrayDeque<Integer> tmp2 = (ArrayDeque<Integer>)list.clone();
  for(int i = 0; i < (N + 1) / 2; i++){
    plus.add(tmp2.pollLast());
  }
  long sum = 0;
  if(N % 2 == 1){
    for(int i = 0; i < plus.size(); i++){
      if(i < plus.size() - 2){
        sum += 2 * plus.get(i);
      }else{
        sum += plus.get(i);
      }
    }
    while(tmp2.size() > 0){
      int p = tmp2.poll();
      sum -= 2 * p;
    }
  }else{
    for(int i = 0; i < plus.size(); i++){
      if(i != plus.size() - 1){
        sum += 2 * plus.get(i);
      }else{
        sum += plus.get(i);
      }
    }
    boolean isFirst = false;
    while(tmp2.size() > 0){
      int p = tmp2.pollLast();
      if(!isFirst){
        isFirst = true;
        sum -= p;
      }else{
        sum -= 2 * p;
      }
    }
  }
  
  ArrayList<Integer> minus = new ArrayList<Integer>();
  for(int i = 0; i < (N + 1) / 2; i++){
    minus.add(list.pollFirst());
  }
  long sum2 = 0;
  if(N % 2 == 1){
    for(int i = 0; i < minus.size(); i++){
      if(i < minus.size() - 2){
        sum2 -= 2 * minus.get(i);
      }else{
        sum2 -= minus.get(i);
      }
    }
    while(list.size() > 0){
      int p = list.poll();
      sum2 += 2 * p;
    }
  }else{
    for(int i = 0; i < minus.size(); i++){
      if(i != minus.size() - 1){
        sum2 -= 2 * minus.get(i);
      }else{
        sum2 -= minus.get(i);
      }
    }
    boolean isFirst = false;
    while(list.size() > 0){
      int p = list.pollLast();
      if(!isFirst){
        isFirst = true;
        sum2 -= p;
      }else{
        sum2 -= 2 * p;
      }
    }
  }

  myout(Math.max(sum, sum2));
	}
	//Method addition frame start


  
	//Method addition frame end
}
