import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		Load[] load = new Load[N];
		Queue q = new Queue();
		boolean[] is_arrived = new boolean[N];
		int returnValue = Integer.MAX_VALUE;
		for(int i = 0; i < N - 1; i++){
			int from = sc.nextInt();
			int src = sc.nextInt();
			load[i] = new Load(from,src);
			is_arrived[i] = false;
		}
		
		for(int i = 0; i< N; i++){
			q.push(new PassData(0,i - 1));
			is_arrived[i] = true;
			while(true){
				if(q.isEmpty()){
					break;
				}
				PassData num = q.pop();
				for(int j = 0; j < N - 1; j++){
					int src = load[j].move(num.nowPlace - 1);
					src = src - 1;
					if((src != -2) &&
						(is_arrived[src] == false) &&
						(num.moveCount + 1 != K)){
						q.push(new PassData(num.moveCount+1,src));
						is_arrived[src] = true;
					}
				}
			}
			int value = 0;
			for(int j = 0; j < N; j++){
				if(is_arrived[j] == false){
					value += 1;
				}
				is_arrived[j] = false;
				q = new Queue();
			}
			
			if(returnValue > value){
				returnValue = value;
			}
		}
		System.out.println(returnValue);
	}
	
}

class Load{
	int from;
	int src;
	
	public Load(int from, int src){
		this.from = from;
		this.src = src;
	}
	
	public int move(int point){
		if(point == from){
			return src;
		}else if(point == src){
			return from;
		}
		return -1;
	}
}

class Queue{
	PassData[] datas;
	int insert_index;
	int get_index;
	int MAX;
	
	public Queue(){
		MAX = Integer.MAX_VALUE;
		datas = new PassData[MAX];
		insert_index = 0;
		get_index = 0;
	}
	
	public void push(PassData num){
		datas[insert_index] = num;
		if(insert_index +1 == MAX){
			insert_index = 0;
		}else{
			insert_index++;
		}
	}
	
	public PassData pop(){
		return datas[get_index++];
	}
	
	public boolean isEmpty(){
		return (insert_index == get_index);
	}
}

class PassData{
	int moveCount;
	int nowPlace;
	
	public PassData(int moveCount,int now_place){
		this.moveCount = moveCount;
		this.nowPlace = now_place;
	}
	
}
