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
    myerr("memory : " + ((rt.totalMemory() - rt.getRuntime().freeMemory()) / 1024) + "KB");
  }
  //↑見なくていいよ！ここまで------------------------------------------
  static void solve(){//ここがメイン関数代わり
	ArrayList<Long> one = nextLongArray();
	long N = one.get(0);
	long K = one.get(1);
	ArrayList<Long> list = nextLongArray();
	long output = 0;
	int maxBit = 42;
	int[] bitCount = new int[maxBit];
	long[] add = new long[maxBit];
	Arrays.fill(bitCount, 0);
	Arrays.fill(add, 0);
	for(int i = 0; i < N; i++){
		output += list.get(i);
		String tmp = Long.toBinaryString(list.get(i));
		String bit = "";
		for(int j = tmp.length() - 1; j >= 0; j--){
			bit += tmp.substring(j, j + 1);
		}
		bit += "00000000000000000000000000000000000000000000";
		for(int j = 0; j < maxBit; j++){
			if(bit.substring(j, j + 1).equals("0")){
				bitCount[j]++;
			}else{
				bitCount[j]--;
			}
		}
	}
	
	long maxX = 0;
	for(int i = 0; i < maxBit; i++){
		if(bitCount[i] > 0){
			if(maxX + (long)Math.pow(2,i) > K){
				break;
			}
			add[i] = (long)Math.pow(2,i) * bitCount[i];
			maxX += (long)Math.pow(2,i);
		}
	}
	while(maxX > K){
		long minAdd = -1;
		int index = -1;
		for(int i = 0; i < maxBit; i++){
			if(add[i] > 0){
				if(minAdd == -1){
					minAdd = add[i];
					index = i;
				}else{
					if(minAdd > add[i]){
						minAdd = add[i];
						index = i;
					}
				}
			}
		}
		if(minAdd == -1){
			break;
		}else{
			add[index] = 0;
			maxX -= (long)Math.pow(2, index);
		}
		myerr(maxX);
	}
	
	for(int i = 0; i < maxBit; i++){
		output += add[i];
	}
	myout(output);
  }
  //Method addition frame start

  //Method addition frame end
}
