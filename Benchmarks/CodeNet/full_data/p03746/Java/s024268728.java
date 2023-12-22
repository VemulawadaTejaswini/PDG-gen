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
static ArrayDeque<Integer> output;
  static void solve(){//ここがメイン関数代わり
	ArrayList<Integer> one = nextIntArray();
	int N = one.get(0);
	int M = one.get(1);
	list = new Node[N];
	for(int i = 0; i < N; i++){
		list[i] = new Node(i);
	}
	for(int i = 0; i < M; i++){
		ArrayList<Integer> tmp = nextIntArray();
		list[tmp.get(0) - 1].child.add(tmp.get(1) - 1);
		list[tmp.get(1) - 1].child.add(tmp.get(0) - 1);
	}
	output = new ArrayDeque<Integer>();
	list[0].access = true;
	output.addFirst(1);
	dfs(0, true);
	dfs(0, false);
	myout(output.size());
	ArrayList<String> tmpOut = new ArrayList<String>();
	while(output.size() > 0){
		tmpOut.add(String.valueOf(output.pollFirst()));
	}
	myout(hanSpToStr(tmpOut));
  }
  //Method addition frame start
public static void dfs(int pushIndex, boolean isBack){
	if(isBack){
		if(pushIndex != 0){
			output.addLast(pushIndex + 1);
		}
	}else{
		if(pushIndex != 0){
			output.addFirst(pushIndex + 1);
		}
	}
	ArrayList<Integer> child = list[pushIndex].child;
	for(int i = 0; i < child.size(); i++){
		if(!list[child.get(i)].access){
			list[child.get(i)].access = true;
			dfs(child.get(i), isBack);
			break;
		}
	}
}
public static class Node{
	int no;
	ArrayList<Integer> child = new ArrayList<Integer>();
	boolean access = false;
	Node(int no){
		this.no = no;
	}
}
  //Method addition frame end
}
