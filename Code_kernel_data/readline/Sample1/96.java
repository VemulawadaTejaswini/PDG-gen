//95
public class func{
	public void loadFile(InputStream st){
    while ((buffer = br.readLine()) != null) {
      result.append(buffer);
    }
    st.close();
}
}
