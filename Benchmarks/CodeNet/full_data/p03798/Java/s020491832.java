import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n = as.nextInt();
		String st = as.next();
		String l = "SS";
		for(int i=1;i<n;i++){
			if(String.valueOf(l.charAt(i)).equals("S")&&String.valueOf(st.charAt(i)).equals("o")){
				l+=String.valueOf(l.charAt(i-1));
			}else if(String.valueOf(l.charAt(i)).equals("S")&&String.valueOf(st.charAt(i)).equals("x")){
				if(String.valueOf(l.charAt(i-1)).equals("S")){
					l+="W";
				}else{
					l+="S";
				}
			}else if(String.valueOf(l.charAt(i)).equals("W")&&String.valueOf(st.charAt(i)).equals("x")){
				l+=String.valueOf(l.charAt(i-1));
			}else if(String.valueOf(l.charAt(i)).equals("W")&&String.valueOf(st.charAt(i)).equals("o")){
				if(String.valueOf(l.charAt(i-1)).equals("S")){
					l+="W";
				}else{
					l+="S";
				}
			}
		}
		if(String.valueOf(l.charAt(n)).equals("S")&&String.valueOf(st.charAt(0)).equals("o")){
			l+=String.valueOf(l.charAt(n-1));
		}else if(String.valueOf(l.charAt(n)).equals("S")&&String.valueOf(st.charAt(0)).equals("x")){
			if(String.valueOf(l.charAt(n-1)).equals("S")){
				l+="W";
			}else{
				l+="S";
			}
		}else if(String.valueOf(l.charAt(n)).equals("W")&&String.valueOf(st.charAt(0)).equals("x")){
			l+=String.valueOf(l.charAt(n-1));
		}else if(String.valueOf(l.charAt(n)).equals("W")&&String.valueOf(st.charAt(0)).equals("o")){
			if(String.valueOf(l.charAt(n-1)).equals("S")){
				l+="W";
			}else{
				l+="S";
			}
		}
		if(String.valueOf(l.charAt(0)).equals(String.valueOf(l.charAt(n)))
				&&String.valueOf(l.charAt(1)).equals(String.valueOf(l.charAt(n+1)))){
			System.out.println(l.substring(0, l.length()-2));
		}else{
			System.out.println("-1");
		}/*
			l = "SW";
			for(int i=1;i<n;i++){
				if(String.valueOf(l.charAt(i)).equals("S")&&String.valueOf(st.charAt(i)).equals("o")){
					l+=String.valueOf(l.charAt(i-1));
				}else if(String.valueOf(l.charAt(i)).equals("S")&&String.valueOf(st.charAt(i)).equals("x")){
					if(String.valueOf(l.charAt(i-1)).equals("S")){
						l+="W";
					}else{
						l+="S";
					}
				}else if(String.valueOf(l.charAt(i)).equals("W")&&String.valueOf(st.charAt(i)).equals("x")){
					l+=String.valueOf(l.charAt(i-1));
				}else if(String.valueOf(l.charAt(i)).equals("W")&&String.valueOf(st.charAt(i)).equals("o")){
					if(String.valueOf(l.charAt(i-1)).equals("S")){
						l+="W";
					}else{
						l+="S";
					}
				}
			}
			if(String.valueOf(l.charAt(n)).equals("S")&&String.valueOf(st.charAt(0)).equals("o")){
				l+=String.valueOf(l.charAt(n-1));
			}else if(String.valueOf(l.charAt(n)).equals("S")&&String.valueOf(st.charAt(0)).equals("x")){
				if(String.valueOf(l.charAt(n-1)).equals("S")){
					l+="W";
				}else{
					l+="S";
				}
			}else if(String.valueOf(l.charAt(n)).equals("W")&&String.valueOf(st.charAt(0)).equals("x")){
				l+=String.valueOf(l.charAt(n-1));
			}else if(String.valueOf(l.charAt(n)).equals("W")&&String.valueOf(st.charAt(0)).equals("o")){
				if(String.valueOf(l.charAt(n-1)).equals("S")){
					l+="W";
				}else{
					l+="S";
				}
			}
			if(String.valueOf(l.charAt(0)).equals(String.valueOf(l.charAt(n)))
					&&String.valueOf(l.charAt(1)).equals(String.valueOf(l.charAt(n+1)))){
				System.out.println(l.substring(0, l.length()-2));
			}else{
				l = "WW";
				for(int i=1;i<n;i++){
					if(String.valueOf(l.charAt(i)).equals("S")&&String.valueOf(st.charAt(i)).equals("o")){
						l+=String.valueOf(l.charAt(i-1));
					}else if(String.valueOf(l.charAt(i)).equals("S")&&String.valueOf(st.charAt(i)).equals("x")){
						if(String.valueOf(l.charAt(i-1)).equals("S")){
							l+="W";
						}else{
							l+="S";
						}
					}else if(String.valueOf(l.charAt(i)).equals("W")&&String.valueOf(st.charAt(i)).equals("x")){
						l+=String.valueOf(l.charAt(i-1));
					}else if(String.valueOf(l.charAt(i)).equals("W")&&String.valueOf(st.charAt(i)).equals("o")){
						if(String.valueOf(l.charAt(i-1)).equals("S")){
							l+="W";
						}else{
							l+="S";
						}
					}
				}
				if(String.valueOf(l.charAt(n)).equals("S")&&String.valueOf(st.charAt(0)).equals("o")){
					l+=String.valueOf(l.charAt(n-1));
				}else if(String.valueOf(l.charAt(n)).equals("S")&&String.valueOf(st.charAt(0)).equals("x")){
					if(String.valueOf(l.charAt(n-1)).equals("S")){
						l+="W";
					}else{
						l+="S";
					}
				}else if(String.valueOf(l.charAt(n)).equals("W")&&String.valueOf(st.charAt(0)).equals("x")){
					l+=String.valueOf(l.charAt(n-1));
				}else if(String.valueOf(l.charAt(n)).equals("W")&&String.valueOf(st.charAt(0)).equals("o")){
					if(String.valueOf(l.charAt(n-1)).equals("S")){
						l+="W";
					}else{
						l+="S";
					}
				}
				if(String.valueOf(l.charAt(0)).equals(String.valueOf(l.charAt(n)))
						&&String.valueOf(l.charAt(1)).equals(String.valueOf(l.charAt(n+1)))){
					System.out.println(l.substring(0, l.length()-2));
				}else{
					l = "WS"
					for(int i=1;i<n;i++){
						if(String.valueOf(l.charAt(i)).equals("S")&&String.valueOf(st.charAt(i)).equals("o")){
							l+=String.valueOf(l.charAt(i-1));
						}else if(String.valueOf(l.charAt(i)).equals("S")&&String.valueOf(st.charAt(i)).equals("x")){
							if(String.valueOf(l.charAt(i-1)).equals("S")){
								l+="W";
							}else{
								l+="S";
							}
						}else if(String.valueOf(l.charAt(i)).equals("W")&&String.valueOf(st.charAt(i)).equals("x")){
							l+=String.valueOf(l.charAt(i-1));
						}else if(String.valueOf(l.charAt(i)).equals("W")&&String.valueOf(st.charAt(i)).equals("o")){
							if(String.valueOf(l.charAt(i-1)).equals("S")){
								l+="W";
							}else{
								l+="S";
							}
						}
					}
					if(String.valueOf(l.charAt(n)).equals("S")&&String.valueOf(st.charAt(0)).equals("o")){
						l+=String.valueOf(l.charAt(n-1));
					}else if(String.valueOf(l.charAt(n)).equals("S")&&String.valueOf(st.charAt(0)).equals("x")){
						if(String.valueOf(l.charAt(n-1)).equals("S")){
							l+="W";
						}else{
							l+="S";
						}
					}else if(String.valueOf(l.charAt(n)).equals("W")&&String.valueOf(st.charAt(0)).equals("x")){
						l+=String.valueOf(l.charAt(n-1));
					}else if(String.valueOf(l.charAt(n)).equals("W")&&String.valueOf(st.charAt(0)).equals("o")){
						if(String.valueOf(l.charAt(n-1)).equals("S")){
							l+="W";
						}else{
							l+="S";
						}
					}
					if(String.valueOf(l.charAt(0)).equals(String.valueOf(l.charAt(n)))
							&&String.valueOf(l.charAt(1)).equals(String.valueOf(l.charAt(n+1)))){
						System.out.println(l.substring(0, l.length()-2));
					}else{
						System.out.println("-1");
					}
				}
			}
		}*/
	}
}