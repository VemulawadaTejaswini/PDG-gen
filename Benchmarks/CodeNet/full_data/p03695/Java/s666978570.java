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
  ArrayList<Integer> tmp = nextIntArray();
  int[] list = new int[N];
  for(int i = 0; i < N; i++){
  	list[i] = tmp.get(i);
  }
  HashSet<String> set = new HashSet<String>();
  int all = 0;
  int notall = 0;
  for(int i = 0; i < N; i++){
    if(list[i] >= 1 && list[i] <= 399 && !set.contains("gray")){
       set.add("gray");
      notall++;
    }
    if(list[i] >= 400 && list[i] <= 799 && !set.contains("brown")){
       set.add("brown");
      notall++;
    }
    if(list[i] >= 800 && list[i] <= 1199 && !set.contains("green")){
       set.add("green");
      notall++;
    }
    if(list[i] >= 1200 && list[i] <= 1599 && !set.contains("water")){
       set.add("water");
      notall++;
    }
    if(list[i] >= 1600 && list[i] <= 1999 && !set.contains("blue")){
       set.add("blue");
      notall++;
    }
    if(list[i] >= 2000 && list[i] <= 2399 && !set.contains("yellow")){
       set.add("yellow");
      notall++;
    }
    if(list[i] >= 2400 && list[i] <= 2799 && !set.contains("orange")){
       set.add("orange");
      notall++;
    }
    if(list[i] >= 2800 && list[i] <= 3199 && !set.contains("red")){
       set.add("red");
      notall++;
    }
    if(list[i] >= 3200){
       all++;
    }
  }
  myerr(set);
  int min = notall;
  int max = notall + all;
  if(min == 0 && all >= 1){
     min = 1;
  }
  myout(min + " " + max);
	}
	//Method addition frame start



	//Method addition frame end
}
