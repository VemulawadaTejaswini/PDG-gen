public class Main{
	public static void main(String args[]){
		try{
				InputStreamReader isr =new InputStreamReader(System.in);
				BufferedReader br =new BufferedReader(isr);
			while(true){
				String buf = br.readLine();
				StringTokenizer st = new StringTokenizer(buf," ");
				int m = Integer.parseInt(st.nextToken());
				int f = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());
				int sum = (m + f);
				String result ="";
				if(m == -1 && f == -1 && r == -1){
					break;
				}else if(m == -1 || f == -1){
					result += "F";
				}else if(sum >= 80){
					result += "A";
				}else if(sum >= 65 && sum < 80){
					result += "B";
				}else if(sum >= 50 && sum < 65){
					result += "C";
				}else if(sum >= 30 && sum < 50){
					if(r >= 50){
						result += "C";
					}else{
						result += "D";
					}
				}else if(sum < 30){
					result += "F";
				}
				System.out.println(result);
			}
		}catch(NumberFormatException e){
			System.out.print(e);
		} catch (IOException e) {
			System.out.print(e);
		}
	}
}
