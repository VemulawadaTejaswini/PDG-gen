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
  ArrayList<Integer> one = nextIntArray();
  int A = one.get(0) * 100;
  int B = one.get(1) * 100;
  int C = one.get(2);
  int D = one.get(3);
  int E = one.get(4);
  int F = one.get(5);
  double max = 0;//濃度
  int[] output = {0, 0};
  HashSet<Integer> waterSet = new HashSet<Integer>();
  HashSet<Integer> soltSet = new HashSet<Integer>();
  int lmax = 4000;
  //水の組み合わせ
  //砂糖の組み合わせ
  double smax = E * ((double)F / (100 + E));
  for(int i = 0; i <= lmax; i++){
    for(int j = 0; j <= lmax; j++){
      int water = A * i + B * j;
      int solt = C * i + D * j;
      if(water <= F){
        waterSet.add(water);
      }
      if(solt <= smax){
        soltSet.add(solt);
      }
    }
  }
  ArrayList<Integer> waterList = new ArrayList<Integer>();
  ArrayList<Integer> soltList = new ArrayList<Integer>();
  Iterator it1 = waterSet.iterator();
      while(it1.hasNext()){
        int key = (int)it1.next();
        waterList.add(key);
      }
  Iterator it2 = soltSet.iterator();
      while(it2.hasNext()){
        int key = (int)it2.next();
        soltList.add(key);
      }
  for(int i = 0; i < waterList.size(); i++){
    for(int j = 0; j < soltList.size(); j++){
      int water = waterList.get(i);
      int solt = soltList.get(j);
      if(water + solt <= F && check(water, solt, E)){
        int sum = water + solt;
        if(sum == 0){continue;}
        double noudo = (double)solt * 100 / sum;
        if(noudo > max){
          max = noudo;
          output[0] = sum;
          output[1] = solt;
        }
      }
    }
  }
  if(max == 0){
    myout(A + " 0");
  }else{
    String[] disp = {String.valueOf(output[0]), String.valueOf(output[1])};
  	myout(myconv(disp, 8));
  }
	}
	//Method addition frame start

static boolean check(int water, int solt, int E){
  double single = (double)water / 100 * E;
  return single >= solt;
}

	//Method addition frame end
}
