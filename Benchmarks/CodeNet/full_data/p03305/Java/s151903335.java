import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long money = 1000000000000000L;
		Scanner in = new Scanner(System.in);
		int cityn = in.nextInt();
		int trainm = in.nextInt();
		int startCity = in.nextInt();
		int goalCity = in.nextInt();
		int[][] yen = new int[cityn][cityn];
		int[][] sunuuku = new int[cityn][cityn];
		for(int m=0;m<trainm;m++) {
			int cityA = in.nextInt();
			int cityB = in.nextInt();
			yen[cityA-1][cityB-1] = yen[cityB-1][cityA-1] = in.nextInt();
			sunuuku[cityA-1][cityB-1] = sunuuku[cityB-1][cityA-1] = in.nextInt();
		}
		long[] cheapestYenToCity = dijkstra(yen,cityn,startCity);
		long[] cheapestSunuukuFromCity = dijkstra(sunuuku, cityn, goalCity);

		long[] charge = new long[cityn];
		for(int exchangeCity=0;exchangeCity<cityn;exchangeCity++) {
			charge[exchangeCity] = cheapestYenToCity[exchangeCity] + cheapestSunuukuFromCity[exchangeCity];
		}
		int minExchangeCity;
		for(int year=0;year<cityn;year = minExchangeCity+1) {
			minExchangeCity = getCheapestExchangeCity(charge, year, cityn);
			for(int i=year;i<=minExchangeCity;i++) {
				System.out.println(money-charge[minExchangeCity]);
			}
		}
		in.close();
	}
	
	public static long[] dijkstra(int[][] cost,int n,int city) {
		long[] cheapest = new long[n];
		boolean[] done = new boolean[n];
		cheapest[city-1] = 0;
		done[city-1] = true;
		int doneIdx = city-1;
		for(int i=1;i<n;i++) {
			long min = Long.MAX_VALUE;
			int minIdx = 0;
			for(int node=0;node<n;node++) {
				if(!done[node]) {
					if(cost[doneIdx][node]>0) {
						if(cheapest[node]==0 || cheapest[node] >= cheapest[doneIdx] + cost[doneIdx][node]) {
							cheapest[node] = cheapest[doneIdx] + cost[doneIdx][node];
						}
					}
					if(cheapest[node]<min && cheapest[node]>0) {
						min = cheapest[node];
						minIdx = node;
					}
				}
			}
			done[minIdx] = true;
			doneIdx = minIdx;
		}
		return cheapest;
	}
	
	public static int getCheapestExchangeCity(long[] charge,int first,int last) {
		long min = charge[first];
		int minIdx = first;
		for(int i=first+1;i<last;i++) {
			if(charge[i]<min) {
				min = charge[i];
				minIdx = i;
			}
		}
		return minIdx;
	}
}
