//23
public class func{
public void read_shouldReturnResponseStream(){
    engine.sendRequest(new Tile(1, 2, new Integer(3).byteValue()));
    InputStream responseStream = engine.read();
    String response = new BufferedReader(new InputStreamReader(responseStream)).readLine();
    assertThat(response).isEqualTo("TEST RESPONSE");
}
}
