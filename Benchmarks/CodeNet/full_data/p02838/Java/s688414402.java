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
  static void solve(){//ここがメイン関数代わり
    int N = nextInt();
    ArrayList<Long> list = nextLongArray();
    long output = 0;
    final long mod = 1000000007;
    int maxBit = 61;
    String[][] count = new String[N][maxBit];
    HashMap<Integer,HashMap<String, Long>> map = new HashMap<Integer,HashMap<String, Long>>();
    for(int i = 0; i < maxBit; i++){
      HashMap<String, Long> tmp = new HashMap<String, Long>();
      tmp.put("0",new Long("0"));
      tmp.put("1",new Long("0"));
      map.put(i, tmp);
    }
    for(int i = 0; i < N; i++){
      for(int j = 0; j < maxBit; j++){
        count[i][j] = "0";
      }
      String binaryString = Long.toBinaryString(list.get(i));
      StringBuilder tmp = new StringBuilder();
      for(int j = binaryString.length() - 1; j >= 0 ; j--){
        tmp.append(binaryString.substring(j,j+1));
      }
      binaryString = tmp.toString();
      
      for(int j = 0; j < binaryString.length(); j++){
        count[i][j] = binaryString.substring(j, j + 1);
      }
      for(int j = 0; j < maxBit; j++){
        HashMap<String, Long> t = map.get(j);
        if(count[i][j].equals("0")){
          t.put("0", t.get("0") + 1);
        }else{
          t.put("1", t.get("1") + 1);
        }
        map.put(j, t);
      }
    }
    for(int i = 0; i < maxBit; i++){
      HashMap<String, Long> t = map.get(i);
      long one = t.get("0");
      long zero = t.get("1");
      long addCount = zero * one * ((long)Math.pow(2, i) % mod);
      output = (output + addCount) % mod;
    }
    myout(output);
  }
  //Method addition frame start

  //Method addition frame end
}
