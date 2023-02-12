public class func{
public void generateRecursive(GenerationConfig config,SchemaMapper mapper,JCodeModel codeModel,String packageName,List<File> schemaFiles){
                mapper.generate(codeModel, getNodeName(child.toURI().toURL()), defaultString(packageName), child.toURI().toURL());
}
}
