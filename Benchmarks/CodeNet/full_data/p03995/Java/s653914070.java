
import java.io.*;
import java.util.*;

 
public class Main{
	int R;
	int C;
	int N;
	HashMap<Integer, Integer> map;
	ArrayDeque<Pair> queue;
	
	class Pair{
		int r;
		int c;
		int value;
		public Pair(int r, int c, int value){
			this.r = r;
			this.c = c;
			this.value = value;
		}
	}
	public void solve(){
		R = nextInt();
		C = nextInt();
		N = nextInt();
		map = new HashMap<>(N * 10);
		queue = new ArrayDeque<>();
		
		for(int i = 0; i < N; i++){
			int r = nextInt();
			int c = nextInt();
			int a = nextInt();
			if(!(checkAdd(r, c, a))){
				out.println("No");
				return;
			}
		}
		while(!queue.isEmpty()){
			Pair p = queue.removeFirst();
			if(!checkAdd(p.r, p.c, p.value)){
				out.println("No");
				
				return;
			}
		}
		out.println("Yes");
	}
	public int key(int r, int c){
		return (r << 16) | c;
	}
	
	public boolean checkAdd(int r, int c, int a){
		if(map.containsKey(key(r, c))){
			return map.get(key(r, c)) == a; 
		}
		
		map.put(key(r, c), a);
		return check(r, c) && check(r - 1, c - 1) && check(r, c - 1) && check(r - 1, c);
	}
	
	public boolean check(int r, int c){
		if(map.containsKey(key(r, c)) &&  map.containsKey(key(r + 1, c + 1))  &&  map.containsKey(key(r, c + 1))  &&  map.containsKey(key(r + 1, c))){
			return map.get(key(r, c)) + map.get(key(r + 1, c + 1)) == map.get(key(r, c + 1)) + map.get(key(r + 1, c));
		}else if(map.containsKey(key(r, c)) &&  map.containsKey(key(r + 1, c + 1))  &&  map.containsKey(key(r, c + 1))  && !map.containsKey(key(r + 1, c))){
			int a = map.get(key(r, c)) + map.get(key(r + 1, c + 1)) - map.get(key(r, c + 1));
			if(a >= 0){
				queue.addLast(new Pair(r + 1, c, a));
				return true;
			}else return false;

		}else if(map.containsKey(key(r, c)) &&  map.containsKey(key(r + 1, c + 1))  && !map.containsKey(key(r, c + 1))  &&  map.containsKey(key(r + 1, c))){
			int a = map.get(key(r, c)) + map.get(key(r + 1, c + 1)) - map.get(key(r + 1, c));
			if(a >= 0){
				queue.addLast(new Pair(r, c + 1, a));
				return true;
			}else return false;

		}else if(map.containsKey(key(r, c)) &&  map.containsKey(key(r + 1, c + 1))  && !map.containsKey(key(r, c + 1))  && !map.containsKey(key(r + 1, c))){
			return true;

		}else if(map.containsKey(key(r, c)) && !map.containsKey(key(r + 1, c + 1))  &&  map.containsKey(key(r, c + 1))  &&  map.containsKey(key(r + 1, c))){
			int a = map.get(key(r, c + 1)) + map.get(key(r + 1, c)) - map.get(key(r, c));
			if(a >= 0){
				queue.addLast(new Pair(r + 1, c + 1, a));
				return true;
			}else return false;
			
			
		}else if(map.containsKey(key(r, c)) && !map.containsKey(key(r + 1, c + 1))  &&  map.containsKey(key(r, c + 1))  && !map.containsKey(key(r + 1, c))){
			if(map.containsKey(key(r + 2, c)) && map.containsKey(key(r + 2, c + 1))){
				return map.get(key(r, c)) + map.get(key(r, c + 1)) == map.get(key(r + 2, c)) + map.get(key(r + 2, c + 1));
			}else if(!map.containsKey(key(r + 2, c)) && map.containsKey(key(r + 2, c + 1))){
				int a = map.get(key(r, c )) + map.get(key(r, c + 1)) - map.get(key(r + 2, c + 1));
				if(a >= 0){
					queue.addLast(new Pair(r + 2, c, a));
					return true;
				}else return false;
				
			}else if(map.containsKey(key(r + 2, c)) && !map.containsKey(key(r + 2, c + 1))){
				int a = map.get(key(r, c )) + map.get(key(r, c + 1)) - map.get(key(r + 2, c));
				if(a >= 0){
					queue.addLast(new Pair(r + 2, c + 1, a));
					return true;
				}else return false;
			}
			
			
			return true;
			
		}else if(map.containsKey(key(r, c)) && !map.containsKey(key(r + 1, c + 1))  && !map.containsKey(key(r, c + 1))  &&  map.containsKey(key(r + 1, c))){
			if(map.containsKey(key(r, c + 2)) && map.containsKey(key(r + 1, c + 2))){
				return map.get(key(r, c)) + map.get(key(r + 1, c)) == map.get(key(r, c + 2)) + map.get(key(r + 1, c + 2));
			}else if(!map.containsKey(key(r, c + 2)) && map.containsKey(key(r + 1, c + 2))){
				int a = map.get(key(r, c )) + map.get(key(r + 1, c)) - map.get(key(r + 1, c + 2));
				if(a >= 0){
					queue.addLast(new Pair(r, c + 2, a));
					return true;
				}else return false;
				
			}else if(map.containsKey(key(r, c + 2)) && !map.containsKey(key(r + 1, c + 2))){
				int a = map.get(key(r, c )) + map.get(key(r + 1, c)) - map.get(key(r, c + 2));
				if(a >= 0){
					queue.addLast(new Pair(r + 1, c + 2, a));
					return true;
				}else return false;
			}
			
			return true;
			
		}else if(map.containsKey(key(r, c)) && !map.containsKey(key(r + 1, c + 1))  && !map.containsKey(key(r, c + 1))  && !map.containsKey(key(r + 1, c))){
			return true;
			
		}else if(!map.containsKey(key(r, c)) &&  map.containsKey(key(r + 1, c + 1))  &&  map.containsKey(key(r, c + 1))  &&  map.containsKey(key(r + 1, c))){
			int a = map.get(key(r, c + 1)) + map.get(key(r + 1, c)) - map.get(key(r + 1, c + 1));
			if(a >= 0){
				queue.addLast(new Pair(r, c, a));
				return true;
			}else return false;
			
			
		}else if(!map.containsKey(key(r, c)) &&  map.containsKey(key(r + 1, c + 1))  &&  map.containsKey(key(r, c + 1))  && !map.containsKey(key(r + 1, c))){
			if(map.containsKey(key(r, c - 1)) && map.containsKey(key(r + 1, c - 1))){
				return map.get(key(r, c + 1)) + map.get(key(r + 1, c + 1)) == map.get(key(r, c - 1)) + map.get(key(r + 1, c - 1));
			}else if(!map.containsKey(key(r, c - 1)) && map.containsKey(key(r + 1, c - 1))){
				int a = map.get(key(r, c + 1 )) + map.get(key(r + 1, c + 1)) - map.get(key(r + 1, c - 1));
				if(a >= 0){
					queue.addLast(new Pair(r, c - 1, a));
					return true;
				}else return false;
				
			}else if(map.containsKey(key(r, c - 1)) && !map.containsKey(key(r + 1, c - 1))){
				int a = map.get(key(r, c + 1)) + map.get(key(r + 1, c + 1)) - map.get(key(r, c - 1));
				if(a >= 0){
					queue.addLast(new Pair(r + 1, c - 1, a));
					return true;
				}else return false;
			}
			
			
			
			return true;

		}else if(!map.containsKey(key(r, c)) &&  map.containsKey(key(r + 1, c + 1))  && !map.containsKey(key(r, c + 1))  &&  map.containsKey(key(r + 1, c))){
			if(map.containsKey(key(r - 1, c)) && map.containsKey(key(r - 1, c + 1))){
				return map.get(key(r + 1, c)) + map.get(key(r + 1, c + 1)) == map.get(key(r - 1, c)) + map.get(key(r - 1, c + 1));
			
			}else if(!map.containsKey(key(r - 1, c)) && map.containsKey(key(r - 1, c + 1))){
				int a = map.get(key(r + 1, c )) + map.get(key(r + 1, c + 1)) - map.get(key(r - 1, c + 1));
				if(a >= 0){
					queue.addLast(new Pair(r - 1, c, a));
					return true;
				}else return false;
				
			}else if(map.containsKey(key(r + 1, c)) && !map.containsKey(key(r + 1, c + 1))){
				int a = map.get(key(r + 1, c )) + map.get(key(r + 1, c + 1)) - map.get(key(r - 1, c));
				if(a >= 0){
					queue.addLast(new Pair(r - 1, c + 1, a));
					return true;
				}else return false;
			}
			
			
			return true;

		}else if(!map.containsKey(key(r, c)) &&  map.containsKey(key(r + 1, c + 1))  && !map.containsKey(key(r, c + 1))  && !map.containsKey(key(r + 1, c))){
			return true;

		}else if(!map.containsKey(key(r, c)) && !map.containsKey(key(r + 1, c + 1))  &&  map.containsKey(key(r, c + 1))  &&  map.containsKey(key(r + 1, c))){
			return true;

		}else if(!map.containsKey(key(r, c)) && !map.containsKey(key(r + 1, c + 1))  &&  map.containsKey(key(r, c + 1))  && !map.containsKey(key(r + 1, c))){
			return true;

		}else if(!map.containsKey(key(r, c)) && !map.containsKey(key(r + 1, c + 1))  && !map.containsKey(key(r, c + 1))  &&  map.containsKey(key(r + 1, c))){
			return true;

		}else if(!map.containsKey(key(r, c)) && !map.containsKey(key(r + 1, c + 1))  && !map.containsKey(key(r, c + 1))  && !map.containsKey(key(r + 1, c))){
			return true;

		}
		return true;
	}
	

	
	private static PrintWriter out;
	public static void main(String[] args){
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}
	
	
	
	public static int nextInt(){
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}
	
	public static long nextLong(){
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}
	public static String next(){
		int c;
		while(!isAlNum(c = read())){}
		StringBuilder build = new StringBuilder();
		build.append((char)c);
		while(isAlNum(c = read())){
			build.append((char)c);
		}
		return build.toString();
	}
	
	
	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;
	private static int read(){
		if(bufferLength < 0) throw new RuntimeException();
		if(bufferIndex >= bufferLength){
			try{
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			}catch(IOException e){
				throw new RuntimeException(e);
			}
			if(bufferLength <= 0) return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}
	
	private static boolean isAlNum(int c){
		return '!' <= c && c <= '~';
	}
}