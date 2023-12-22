import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
  //↓見なくていいよ！ここから------------------------------------------
  static public class InputIterator{
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
    public boolean hasNext(){return (index < max);}
    public String next(){
      if(hasNext()){
        String returnStr = inputLine.get(index);
        index++;
        return returnStr;
      }else{
        throw new IndexOutOfBoundsException("これ以上入力はないよ。");
      }
    }
  }
  
  static InputIterator ii = new InputIterator();//リアクティブでは使えないので諦めてScanner使うこと
  static PrintWriter out = new PrintWriter(System.out);
  static void flush(){out.flush();}
  static void myout(Object t){out.println(t);}
  static void myerr(Object t){System.err.println(t);}
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
    solve();
    flush();
  }
  //↑見なくていいよ！ここまで------------------------------------------
  static public void solve(){//ここがメイン関数代わり
    int N = nextInt();
    ArrayList<Integer> aList = nextIntArray();
    ArrayList<Integer> bList = nextIntArray();
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    for(int i = 0; i < N; i++){
      pq.add(bList.get(i));
      hm.put(bList.get(i), i);
    }
    int output = 0;
    //操作を逆順で見る。値が大きいやつから見る
    //pqからとれた最大値%(その前後ふたつを足したもの)=bList[取れた場所]更新
    //Math.floor(pqからとれた最大値/(その前後ふたつを足したもの))=操作回数
    while(pq.size() != 0){
      int max = pq.poll();
      int index = hm.get(max);
      int mae = index - 1;
      if(mae == -1){
        mae = N - 1;
      }
      int ato = index + 1;
      if(ato == N){
        ato = 0;
      }
      int bMae = bList.get(mae);
      int bAto = bList.get(ato);
      if(max - (bMae + bAto) < 1){
        output = -1;
        break;
      }else{
        output += Math.floor(max / (bMae+bAto));
        hm.remove(max);
        max = max % (bMae + bAto);
        hm.put(max, index);
        bList.set(index, max);
        if(max != aList.get(index)){
          pq.add(max);
        }
      }
    }
    myout(output);
  }
  //Method addition frame start

  //Method addition frame end
}
