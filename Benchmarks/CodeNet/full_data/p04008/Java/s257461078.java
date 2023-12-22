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
static Node[] nodes;
static int output;
static int K;
  static void solve(){//ここがメイン関数代わり
	ArrayList<Integer> one = nextIntArray();
	int N = one.get(0);
	K = one.get(1);
	output = 0;
	ArrayList<Integer> list = nextIntArray();
	if(list.get(0) != 1){
		output++;
		list.set(0, 1);
	}
	nodes = new Node[N];
	for(int i = 0; i < N; i++){
		nodes[i] = new Node();
	}
	for(int i = 0; i < N; i++){
		nodes[i].parent = list.get(i) - 1;
		nodes[nodes[i].parent].child.add(i);
	}
	nodes[0].access = true;
	dfs(0);
	myout(output);
  }
  //Method addition frame start
static int dfs(int now){
	ArrayList<Integer> child = nodes[now].child;
	int D = 0;
	for(int i = 0; i < child.size(); i++){
		if(!nodes[child.get(i)].access){
			nodes[child.get(i)].access = true;
			D = Math.max(D, dfs(child.get(i)) + 1);
		}
	}
	if(D == K - 1){
		if(nodes[now].parent != 0 && now != 0){
			output++;
			D = -1;
		}
	}
	return D;
}
static class Node{
	int parent = -1;
	int depth = 0;
	boolean access = false;
	ArrayList<Integer> child = new ArrayList<Integer>();
	Node(){}
}
  //Method addition frame end
}
