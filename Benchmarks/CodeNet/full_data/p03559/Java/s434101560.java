import java.util.*;
import java.io.*;
public class Main{
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
  
  static InputIterator ii = new InputIterator(); 
  static PrintWriter out = new PrintWriter(System.out);
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
    out.flush();
  }
  static public void solve(){//ここがメイン関数代わり
    int N = nextInt();
  ArrayList<Integer> alist = nextIntArray();
  Collections.sort(alist,Comparator.naturalOrder());
    ArrayList<Integer> blist = nextIntArray();
  Collections.sort(blist,Comparator.naturalOrder());
    ArrayList<Integer> clist = nextIntArray();
  Collections.sort(clist,Comparator.naturalOrder());
  
  long output = 0;
  for(int i = 0; i < N; i++){
    long mae = binary_search(alist, blist.get(i), true);
    long ato = binary_search(clist, blist.get(i), false);
    output += mae * ato;
  }
  myout(output);
  }
  //Method addition frame start
static public long binary_search(ArrayList<Integer> list,int search,boolean isA){
  //listはあらかじめ昇順ソート済みとする。右側が有効エリア、左側が無効エリアと
  //仮定し、searchによって返す要素(インデックス)は有効な部分の最小値である。
  //逆に無効な部分の最大値を返すなら↑のインデックスを1引いて返せばいい
  int ng = -1;
  int ok = list.size();
  int center;
  while(Math.abs(ok - ng) > 1){
    center = (int)Math.floor((ok + ng) / 2);
    if(isA){
      if(list.get(center) >= search){
        ok = center;
      }else{
        ng = center;
      }
    }else{
      if(list.get(center) > search){
        ok = center;
      }else{
        ng = center;
      }
    }
  }
  if(isA){
    return (long)(ng + 1);
  }else{
    if(ok != list.size() && list.get(ok) == search){
       ng++;
    }
    return (long)(list.size() - (ng + 1));
  }
}
  //Method addition frame end
}
