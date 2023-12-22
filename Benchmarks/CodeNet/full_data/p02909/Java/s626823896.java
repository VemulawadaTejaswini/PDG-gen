public class Main {
    public static void main(String[] args) throws Exception {
        String todayWeather = args[0];
        if(todayWeather.equals("Sunny")){
            System.out.println("Cloudy");
        }else if(todayWeather.equals("Cloudy")){
            System.out.println("Rainy");
        } else{
            System.out.println("Sunny");
        }
    }
}