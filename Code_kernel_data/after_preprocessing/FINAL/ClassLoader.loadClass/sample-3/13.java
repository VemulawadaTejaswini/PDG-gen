public class func{
public void configureDeserializationProblemHandlers(final ObjectMapper objectMapper,final String deserializationProblemHandlers,final ClassLoader classLoader){
        final StringTokenizer st = new StringTokenizer(deserializationProblemHandlers, ", ");
        while (st.hasMoreTokens()) {
            final Class<?> c = classLoader.loadClass(st.nextToken());
            objectMapper.addHandler((DeserializationProblemHandler) c.newInstance());
        }
}
}
