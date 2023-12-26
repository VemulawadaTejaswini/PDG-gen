class Main{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int  	n,
				x,
				a,			
				b = 2,		
				c = 3,		
				count;	
		String[] input = new String[2];		
		String output = "";					
		try{
			input = br.readLine().split("[\\s]+");		
			while(true){
				n = Integer.parseInt(input[0]);
				x = Integer.parseInt(input[1]);
				if(n == 0 && x == 0){		
					break;
				}
				count = 0;
				for(a = 1;a < b;a++){			
					for(b = a+1;b < c;b++){		
						for(c = n;c > b;c--){	
							if(a + b + c == x){	
								count++;		
							}
						}
						c = n;
					}
				}
				output += count + "\n";			
				input = br.readLine().split("[\\s]+");	
			}
		}catch(IOException e){
			System.out.println(e);
			return;
		}
		System.out.print(output);
	}
}
