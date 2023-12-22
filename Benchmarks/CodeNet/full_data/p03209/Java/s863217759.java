import java.util.*;import java.io.*;import java.math.*;
public class Main{
  //↓見なくていいよ！ここから------------------------------------------
  static class InputIterator{
    ArrayList<String> inputLine = new ArrayList<String>(1024);
    int index = 0; int max;
    InputIterator(){
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      while(true){
        String read;
        try{
          read = br.readLine();
        }catch(IOException e){
          read = null;
        }
        if(read != null){
          inputLine.add(read);
        }else{
          break;
        }
      }
      max = inputLine.size();
    }
    boolean hasNext(){return (index < max);}
    String next(){
      if(hasNext()){
        String returnStr = inputLine.get(index);
        index++;
        return returnStr;
      }else{
        throw new IndexOutOfBoundsException("これ以上入力はないよ");
      }
    }
  }
  
  static InputIterator ii = new InputIterator();//リアクティブでは使えないので諦めてScanner使うこと
  static PrintWriter out = new PrintWriter(System.out);
  static void flush(){out.flush();}
  static void myout(Object t){out.println(t);}
  static void myerr(Object t){System.err.print("debug:");System.err.println(t);}
  static String next(){return ii.next();}
  static int nextInt(){return Integer.parseInt(next());}
  static long nextLong(){return Long.parseLong(next());}
  static ArrayList<String> nextStrArray(){return myHanSpSplit(next());}
  static ArrayList<String> myHanSpSplit(String str){return new ArrayList<String>(Arrays.asList(str.split(" ")));}
  static ArrayList<String> nextCharArray(){return mySingleSplit(next());}
  static ArrayList<String> mySingleSplit(String str){return new ArrayList<String>(Arrays.asList(str.split("")));}
  static ArrayList<Integer> nextIntArray(){
    ArrayList<Integer> ret = new ArrayList<Integer>();
    ArrayList<String> input = nextStrArray();
    for(int i = 0; i < input.size(); i++){
      ret.add(Integer.parseInt(input.get(i)));
    }
    return ret;
  }
  static ArrayList<Long> nextLongArray(){
    ArrayList<Long> ret = new ArrayList<Long>();
    ArrayList<String> input = nextStrArray();
    for(int i = 0; i < input.size(); i++){
      ret.add(Long.parseLong(input.get(i)));
    }
    return ret;
  }
  static String kaigyoToStr(String[] list){return String.join("\n",list);}
  static String kaigyoToStr(ArrayList<String> list){return String.join("\n",list);}
  static String hanSpToStr(String[] list){return String.join(" ",list);}
  static String hanSpToStr(ArrayList<String> list){return String.join(" ",list);}
  public static void main(String[] args){
    Runtime rt = Runtime.getRuntime();
    long mae = System.currentTimeMillis();
    solve();
    flush();
    long ato = System.currentTimeMillis();
    myerr("time : " + (ato - mae) + "ms");
    myerr("memory : " + ((rt.totalMemory() - rt.freeMemory()) / 1024) + "KB");
  }
  //↑見なくていいよ！ここまで------------------------------------------
static Node[] list;
static int N;
static long K;
static long output;
  static void solve(){//ここがメイン関数代わり
	ArrayList<Long> one = nextLongArray();
	N = Integer.parseInt(String.valueOf(one.get(0)));
	K = one.get(1);
	output = 0;
	list = new Node[N + 1];
	dfs(0);
	output = dfs2(K, false);
	
	myout(output);
  }
  //Method addition frame start
static long dfs2(long eat, boolean isDeep){
	
	if(eat <= 0){
		return 0;
	}
	long ret = 0;
	boolean get = false;
	for(int i = 0; i <= N; i++){
		long max = list[i].P + list[i].B;
		if(!get && max >= eat){
			if(i == 0){
				ret = 1;
			}else{
				if(K <= list[i - 1].P + list[i - 1].B + 1){
					ret = list[i - 1].P;
				}else if(K == list[i - 1].P + list[i - 1].B + 2){
					ret = list[i - 1].P + 1;
				}else{
					//半分+1以上ならどうする？
					ret = list[i - 1].P + 1;
					eat -= list[i - 1].P + list[i - 1].B + 2;
					myerr(eat);
					ret += dfs2(eat, true);
				}
			}
			get = true;
			continue;
		}
		if(get){
			if(isDeep){
				return ret;
			}
			ret--;
			if(ret < 0){
				ret = 0;
			}
		}
	}
	return ret;
}
static void dfs(int level){
	if(level == N + 1){
		return;
	}
	Node no = new Node();
	if(level == 0){
		no.P = 1;
		no.B = 0;
	}else{
		no.P = list[level - 1].P * 2 + 1;
		no.B = list[level - 1].B * 2 + 2;
	}
	list[level] = no;
	dfs(level + 1);
}
static class Node{
	long P;
	long B;
}
  //Method addition frame end
}
