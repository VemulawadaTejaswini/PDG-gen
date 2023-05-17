//2
public class func{
public void generateRecursive(GenerationConfig config,SchemaMapper mapper,JCodeModel codeModel,String packageName,List<File> schemaFiles){
        Collections.sort(schemaFiles);
        for (File child : schemaFiles) {
            if (child.isFile()) {
                mapper.generate(codeModel, getNodeName(child.toURI().toURL()), defaultString(packageName), child.toURI().toURL());
            } else {
                generateRecursive(config, mapper, codeModel, childQualifiedName(packageName, child.getName()), Arrays.asList(child.listFiles(config.getFileFilter())));
            }
        }
}
}
