class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> mid = new ArrayList<Integer>();
		ArrayList<Integer> fin = new ArrayList<Integer>();
		ArrayList<Integer> rex = new ArrayList<Integer>();
		int m=0;
		int f=0;
		int r=0;
		int score =0;
		while(m != -1 || f!= -1 || r != -1){
			m =scan.nextInt();
			f =scan.nextInt();
			r =scan.nextInt();
			mid.add(m);
			fin.add(f);
			rex.add(r);
		}
		for (int i=0;i<mid.size()-1;i++){
			score = mid.get(i) + fin.get(i);
			if (mid.get(i) == -1 ||fin.get(i) == -1){	
				System.out.println("F");
			}
			else if(score >= 80){	
				System.out.println("A");
			}
			else if(score >= 65){	
				System.out.println("B");
			}
			else if(score >= 50){	
				System.out.println("C");
			}
			else if(rex.get(i) >=50){	
				System.out.println("C");
			}
			else if(score >= 30){	
				System.out.println("D");
			}
			else{	
				System.out.println("F");
			}
		}
	}
}
