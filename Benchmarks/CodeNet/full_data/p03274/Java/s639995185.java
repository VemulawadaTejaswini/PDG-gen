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
    ArrayList<Integer> one = nextIntArray();
	int N = one.get(0);
	int K = one.get(1);
	ArrayList<Integer> list = nextIntArray();
	ArrayList<Long> ruiseki = new ArrayList<Long>();
    ruiseki.add(new Long("0"));
	int startIndex = list.indexOf(0);
	long output = (long)Math.pow(10,16);
	if(startIndex != -1){
		//0がある
		K--;
		if(K == 0){
			myout(0);
			return;
		}
	}else if(list.get(0) > 0){
		//始点が左端
		myout(Math.abs(list.get(K - 1)));
		return;
	}else if(list.get(N - 1) < 0){
		//始点が右端
		myout(Math.abs(list.get(N - K)));
		return;
	}else{
		ArrayList<Integer> tmpList = new ArrayList<Integer>();
		boolean isZero = false;
		for(int i = 0; i < N; i++){
			if(!isZero && list.get(i) > 0){
				tmpList.add(0);
				isZero = true;
				startIndex = i;
			}
			tmpList.add(list.get(i));
		}
		list = tmpList;
		N++;
	}
	for(int i = 0; i < N - 1; i++){
      	long addVal = ruiseki.get(ruiseki.size() - 1) + Math.abs(Math.abs(list.get(i)) - Math.abs(list.get(i + 1)));
		ruiseki.add(addVal);
	}
	int left = startIndex - 1;
	int leftCount = K;
	int right = startIndex + 1;
	int rightCount = K;
	while(left >= 0 && leftCount > 0){
		long tmpSum = ruiseki.get(startIndex) - ruiseki.get(left);
		if(startIndex - left < K){
			tmpSum *= 2;//折り返し
			tmpSum += ruiseki.get(startIndex + (K - (startIndex - left))) - ruiseki.get(startIndex);
		}
		output = Math.min(output, tmpSum);
		left--;
		leftCount--;
	}
	
	while(right < N && rightCount > 0){
		var tmpSum = ruiseki.get(right) - ruiseki.get(startIndex);
		if(right - startIndex < K){
			tmpSum *= 2;//折り返し
			tmpSum += ruiseki.get(startIndex) + ruiseki.get(startIndex - (K - (right - startIndex)));
		}
		output = Math.min(output, tmpSum);
		right++;
		rightCount--;
	}
	myout(output);
  }
  //Method addition frame start

  //Method addition frame end
}
