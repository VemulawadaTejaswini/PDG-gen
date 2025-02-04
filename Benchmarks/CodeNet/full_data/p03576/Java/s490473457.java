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
    int reqK = one.get(1);
    Point[] list = new Point[N];
    long output = Long.parseLong("9223372036854775807");
    for(int i = 0; i < N; i++){
      ArrayList<Integer> tmp = nextIntArray();
      list[i] = new Point(tmp.get(0), tmp.get(1));
    }
    
    for(int i = 0; i < N; i++){
      Point start = list[i];
      int startX = start.x;
      int startY = start.y;
      for(int j = 0; j < N; j++){
        for(int k = 0; k < N; k++){
          if(i == j || i == k){
            continue;
          }
          Point onlyX = list[j];
          int endX = onlyX.x;
          Point onlyY = list[k];
          int endY = onlyY.y;
          if(startX > endX){
            int tmp = startX;
            startX = endX;
            endX = tmp;
          }
          if(startY > endY){
            int tmp = startY;
            startY = endY;
            endY = tmp;
          }
          
          int count = 0;
          for(int l = 0; l < N; l++){
            if(startX <= list[l].x && list[l].x <= endX && startY <= list[l].y && list[l].y <= endY){
              count++;
            }
          }
          if(count >= reqK){
            long S = Math.abs((long)(startX - endX)) * Math.abs((long)(startY - endY));
            output = Math.min(S, output);
          }
        }
      }
    }
    myout(output);
    
  }
  //Method addition frame start
public static class Point{
  int x;
  int y;
  Point(int x, int y){
    this.x = x;
    this.y = y;
  }
}
  //Method addition frame end
}
