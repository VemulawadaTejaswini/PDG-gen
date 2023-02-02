//85
public class func{
public void ensureTime(JsonObject context){
        String nowAsISO8601 = df.format(new Date());
        context.addProperty(KEY_REFTIME, nowAsISO8601);
}
}
