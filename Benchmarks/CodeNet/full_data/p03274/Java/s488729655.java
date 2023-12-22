//package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	
	
	
	private static boolean isPrint = false;
	public static void main(String[] args) throws Exception {
		/*BufferedReader br = new BufferedReader(
				new InputStreamReader(Main.class.getResourceAsStream("/data.txt")));*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] systemInLine = br.readLine().split(" ");
		//蜡烛总数 
		int candleCount = Integer.parseInt(systemInLine[0]);
		//点燃总数 
		int burning = Integer.parseInt(systemInLine[1]);
		showMessage("蜡烛总数:"+candleCount+",点燃总数:"+burning);
		systemInLine = br.readLine().split(" ");
		List<Cd> list = new ArrayList<>(candleCount);
		for (int i = 0; i < candleCount; i++) {
			list.add(new Cd(i+1, Integer.parseInt(systemInLine[i])));
		}
		showMessage(list);
		int left = Integer.MIN_VALUE;
		int right = Integer.MAX_VALUE;
		int sum = Integer.MAX_VALUE;
		for (int i = 0; i < systemInLine.length&&i+burning-1<systemInLine.length; i++) {
			left = list.get(i).getAbsValue();
			right = list.get(i+burning-1).getAbsValue();
			sum =Math.min(Math.min(left*2+right, left+right*2),sum);
		}
		System.out.println(sum);
	}
	/**
	 * 前m个中点燃n个的最少路程
	 * @param m
	 * @param n
	 * @return
	 */
	public static int burningCandle(int m,int n) {
		return
				0;
	}
	public static void showMessage(Object message) {
		if(isPrint) {
			System.out.println(message);
		}
	}
}
class Cd{
	//顺序编号
	private int seq;
	//坐标
	private int index;
	//距离0点距离
	private int absValue;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getAbsValue() {
		return absValue;
	}
	/*public void setAbsValue(int absValue) {
		this.absValue = absValue;
	}*/
	public Cd(int seq, int index) {
		super();
		this.seq = seq;
		this.index = index;
		this.absValue = Math.abs(index);
	}
	@Override
	public String toString() {
		return "Cd [seq=" + seq + ", index=" + index + ", absValue=" + absValue + "]";
	}
	
	
}