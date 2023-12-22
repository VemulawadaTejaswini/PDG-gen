
public class renshu {

	public static void main(String[] args) {

		String weather = args[0];

		if(weather.equals("Sunny")) {
			System.out.println("Cloudy");
		}else if(weather.equals("Cloudy")) {
			System.out.println("Rainy");
		}else if(weather.equals("Rainy")) {
			System.out.println("Sunny");
		}else {
			System.out.println("Sunny or Cloudy or Rainy");
		}

	}

}