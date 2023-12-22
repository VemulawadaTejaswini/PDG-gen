import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main{
	static int N,M;
	static int [] candle;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		candle = new int[N];
		boolean stackZoreFlag = false;
		boolean queueZoreFlag = false;
		
		//创建一个栈
		Deque<Integer> stackMinus =  new LinkedList<Integer>();
		//创建一个队列
		java.util.Queue<Integer> queuePlus = new LinkedList<Integer>();
		
		List<Integer> candleList = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			candle[i] = sc.nextInt();
			if(candle[i]<0) {
				stackMinus.push(candle[i]);
			}else {
				queuePlus.offer(candle[i]);
			}
		}
		
		int stackelement = 0;
		int queuelement = 0;
	    //加入离原点最近的M个点
		while(candleList.size()!=M) {
			//取栈中的元素
			if(stackMinus.size() != 0) {
				stackelement = (int) stackMinus.peek();
			}else {
				stackZoreFlag = true;
			}
			//取队列中的元素
			if(queuePlus.size() != 0) {
				queuelement = (int) queuePlus.element();
			}else {
				queueZoreFlag = true;
			}
			
			if(stackZoreFlag) {
				candleList.add(queuelement);
				queuePlus.poll();
			}else if(queueZoreFlag) {
				candleList.add(stackelement);
				stackMinus.pop();
			}else {
				int element = distanceV(0,stackelement) <= distanceV(0,queuelement)?stackelement:queuelement;
				candleList.add(element);
				if(element == stackelement) {
					stackMinus.pop();
				}else if(element == queuelement){
					queuePlus.poll();
				}
			}
		}
		
		Collections.sort(candleList);
		
		//求最短路径并输出
		int minCandle = candleList.get(0);
		int maxCandle = candleList.get(candleList.size()-1);
		if(minCandle>=0 && maxCandle>=0) {
			System.out.println(distanceV(0,maxCandle));
		}else if(minCandle<0 && maxCandle>=0){
			int minCandleDistance = distanceV(0,minCandle);
			int maxCandleDistance = distanceV(0,maxCandle);
			if(minCandleDistance <= maxCandleDistance) {
				System.out.println(2*minCandleDistance+maxCandleDistance);
			}else {
				System.out.println(minCandleDistance+maxCandleDistance*2);
			}
		}else {
			System.out.println(distanceV(minCandle,0));
		}
		
		sc.close();
	}
	
	private static int distanceV(int a,int b) {
		int dis = Math.abs(a-b);
		return dis;
	}
}


