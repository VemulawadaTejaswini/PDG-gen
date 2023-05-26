public class func{
public void call(){
    BufferedReader rd = new BufferedReader(new InputStreamReader(performRequest()));
    while ((chunk = rd.readLine()) != null) {
      sb.append(chunk);
    }
    return new RequestResponse(sb.toString());
}
}
