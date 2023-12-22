import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String ss = sc.next();
		
		int ans = 0;
		Stack stack = new Stack();
		
		for(int i = 0;i < ss.length();i++){
			if(stack.isEmpty()){
				stack.push(ss.charAt(i));
			}else{
				if(stack.peak() != ss.charAt(i)){			//01 or 10 なら削除
					ans += 2;
					stack.pop();
				}else{								//追加
					stack.push(ss.charAt(i));
				}
				
			}
		}
		System.out.println(ans);
		
	}
	
	
}


class Stack{
	int data[];
	int top;
	private	int max =100000000;

	Stack(){
		data = new int[max];
	}
	Stack(int size){
		top =0;
		max = size;
		try{
			data = new int[max];
		}catch(OutOfMemoryError e){
			max = 0;   
		}
	}

	void push(int x)throws RuntimeException{
		if(top >= max)
			throw new RuntimeException();
		data[top] = x;
		top++;
		return ;
	}

	int pop() throws RuntimeException{
		if(top<=0){
			throw new RuntimeException();

		}return data[--top];

	}

	boolean isEmpty(){
		if(top == 0){
			return	true;
		}else{
			return	false;
		}

	}

	int peak(){
		top--;					//pushの時は次の配列にいってるので戻す
		return data[top++];		
	}

}
