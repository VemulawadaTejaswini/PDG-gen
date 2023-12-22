import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		ArrayList<Res> ResList = new ArrayList<Res>();

		for(int i = 0;i<N;i++){
			String[] tmp = br.readLine().split(" ");
			Res r = new Res(tmp[0],Integer.parseInt(tmp[1]),i);
			ResList.add(r);
		}

		ResList.sort((a,b) -> a.city.compareTo(b.city));

		Queue<Integer> q = new ArrayDeque<>();
		try{
			int i = 0;

			while(true){
				String nowCity = ResList.get(i).city;
				ArrayList<Res> nowList = new ArrayList<Res>();



				while(true){
					if(i == ResList.size())break;
					if(!ResList.get(i).city.equals(nowCity))break;
					Res r = new Res(ResList.get(i).city,ResList.get(i).point,ResList.get(i).id);
					nowList.add(r);
					i++;
				}

				nowList.sort((a,b) -> b.point - a.point);

				for(int i1 = 0;i1<nowList.size();i1++){
					q.add(nowList.get(i1).id);
				}



			}
		}catch(Exception e){
			e.getMessage();
		}finally{
			while(!q.isEmpty()){
				System.out.println(q.poll() + 1);
			}
		}
	}

	static class Res{
		String city;
		int point;
		int id;

		Res(String c,int p,int i){
			city = c;
			point = p;
			id = i;
		}
	}
}