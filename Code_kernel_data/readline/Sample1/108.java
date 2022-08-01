//107
public class func{
	public void getNumberOfRatings(BufferedReader reader){
    while ((line = reader.readLine()) != null)
      if (!line.contains("|"))
        num_ratings++;
}
}
