class Main{
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
        while(true){
			int m = scan.nextInt(); 
			int f = scan.nextInt(); 
			int r = scan.nextInt();	
			if(m==-1 && f==-1 && r==-1){
				break;
			}
			if(m==-1 || f==-1){ 
				list.add("F");
			}
			else if((m + f) >= 80){ 
				list.add("A");
			}
			else if((m + f) >= 65 && (m + f) < 80){ 
				list.add("B");
			}
			else if((m + f) >= 50 && (m + f) < 65){ 
				list.add("C");
			}
			else if((m + f) >= 30 && (m + f) < 50){ 
				if(r >= 50){ 
					list.add("C");
				}
				else{
					list.add("D");
				}
			}
			else if((m + f) < 30){ 
				list.add("F");
			}
		}
		for(String str : list){
			System.out.println(str);
		}
    }
}
