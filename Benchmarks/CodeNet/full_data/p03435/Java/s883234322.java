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
  int[][] list = new int[3][3];
      for(int i = 0; i < 3; i++){
        ArrayList<Integer> tmp = nextIntArray();
        for(int j = 0; j < 3; j++){
          list[i][j] = tmp.get(j);
        }
      }
  //行中の0-1番目の差、1-2番目の差がすべての行で一致している
  //または、列中の0-1番目の差、1-2番目の差がすべての列で一致している
  String output = "Yes";
  int gyo112 = Math.abs(list[0][0] - list[0][1]);
  int gyo212 = Math.abs(list[1][0] - list[1][1]);
  int gyo312 = Math.abs(list[2][0] - list[2][1]);
  int gyo123 = Math.abs(list[0][2] - list[0][1]);
  int gyo223 = Math.abs(list[1][2] - list[1][1]);
  int gyo323 = Math.abs(list[2][2] - list[2][1]);
  int retu112 = Math.abs(list[0][0] - list[1][0]);
  int retu212 = Math.abs(list[0][1] - list[1][1]);
  int retu312 = Math.abs(list[0][2] - list[1][2]);
  int retu123 = Math.abs(list[2][0] - list[1][0]);
  int retu223 = Math.abs(list[2][1] - list[1][1]);
  int retu323 = Math.abs(list[2][2] - list[1][2]);
  if(gyo112 != gyo212 || gyo212 != gyo312 || gyo112 != gyo312
    || retu112 != retu212 || retu212 != retu312 || retu112 != retu312
    || gyo123 != gyo223 || gyo223 != gyo323 || gyo123 != gyo323
    || retu123 != retu223 || retu223 != retu323 || retu123 != retu323){
    output = "No" ;
  }
  myout(output);
	}
	//Method addition frame start



	//Method addition frame end
}
