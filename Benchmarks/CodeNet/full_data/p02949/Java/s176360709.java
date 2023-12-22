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
  static void solve(){//ここがメイン関数代わり
	ArrayList<Integer> one = nextIntArray();
	int N = one.get(0);
	int M = one.get(1);
	int P = one.get(2);
	Node[] list = new Node[N];
	for(int i = 0; i < N; i++){
		list[i] = new Node();
	}
	for(int i = 0; i < M; i++){
		ArrayList<Integer> tmp = nextIntArray();
		list[tmp.get(0) - 1].dist.put(tmp.get(1) - 1, tmp.get(2));
	}
	list[0].cost = 0;
	PriorityQueue<QueueObject> pq = new PriorityQueue<QueueObject>(new originComparator());
	QueueObject first = new QueueObject(0, 0, 0);
	pq.add(first);
	while(!pq.isEmpty()){
		QueueObject tmp = pq.poll();
		int now = tmp.no;
		int ruiseki = tmp.value;
		boolean isInf = tmp.isInf;
		int mass = tmp.mass;
		if(now == N - 1 && isInf){
			myout(-1);
			return;
		}
		Iterator it = list[now].dist.keySet().iterator();
		while(it.hasNext()){
			int tonari = (int)it.next();
			if(tonari == now && !list[tonari].access && list[now].dist.get(tonari) > P){
				//無限ループのところ。
				list[tonari].access = true;
				QueueObject addObj = new QueueObject(now, ruiseki, mass);
				addObj.isInf = true;
				pq.add(addObj);
			}else{
				//張ってるコストと、キュー+となりのコストを比べて大きい方を更新
				int maelast = list[tonari].cost - list[tonari].mass * P;
				int atolast = ruiseki + list[now].dist.get(tonari) - (mass + 1) * P;
				if(maelast < atolast){
					list[tonari].cost = ruiseki + list[now].dist.get(tonari);
					list[tonari].mass = mass + 1;
					QueueObject addObj = new QueueObject(tonari, ruiseki + list[now].dist.get(tonari), mass + 1);
					if(isInf){
						addObj.isInf = true;
					}
					pq.add(addObj);
				}
			}
		}
	}
	myout(Math.max(list[N - 1].cost - list[N - 1].mass * P,0));
  }
  //Method addition frame start
public static class Node{
	HashMap<Integer, Integer> dist = new HashMap<Integer, Integer>();
	int cost = -1;
	int mass = 0;
	boolean access = false;
	Node(){}
}
public static class QueueObject{
	int no;
	int value;
	int mass;
	boolean isInf = false;
	QueueObject(int n, int v, int mass){
		no = n;
		value = v;
		this.mass = mass;
	}
}
public static class originComparator implements Comparator<QueueObject>{
	public int compare(QueueObject mae, QueueObject ato){
		return ato.value - mae.value;
	}
}
  //Method addition frame end
}
