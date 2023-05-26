//147
public class func{
public void additionalPropertiesAreNotDeserializableWhenDisallowed(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/additionalProperties/noAdditionalProperties.json", "com.example");
        Class<?> classWithNoAdditionalProperties = resultsClassLoader.loadClass("com.example.NoAdditionalProperties");
        mapper.readValue("{\"a\":\"1\", \"b\":2}", classWithNoAdditionalProperties);
}
}
