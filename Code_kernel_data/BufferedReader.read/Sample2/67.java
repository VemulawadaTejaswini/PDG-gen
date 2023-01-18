//66
public class func{
	public void getBadgerFishReader(Reader reader){
         do
         {
            wasRead = bufferedReader.read(buffer, 0, 100);
            if (wasRead > 0) buf.append(buffer, 0, wasRead);
         } while (wasRead > -1);
         badger = new BadgerFishXMLStreamReader(new JSONObject(new JSONTokener(buf.toString())));
}
}
