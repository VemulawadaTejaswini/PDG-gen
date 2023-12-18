class Main{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String array[] = str.split(" ");
		int x = Integer.parseInt(array[0]);
		int y = Integer.parseInt(array[1]);
		int z = Integer.parseInt(array[2]);
		if (x <= y && y <= z){
			System.out.println(x +" " + y + " " + z);
			}else if (x <= z && z <= y){
			System.out.println(x +" " + z + " " + y);
			}else if (y <= x && x <= z){
			System.out.println(y +" " + x + " " + z);
			}else if (y <= z && z <= x){
			System.out.println(y +" " + z + " " + x);
            }else if (z <= x && x <= y){
			System.out.println(z +" " + x + " " + y);
			}else if (z <= y && y <= x){
			System.out.println(z +" " + y + " " + x);
			}
			}
			}
