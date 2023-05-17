//42
public class func{
public void compress(){
    cx.evaluateReader(scope, new InputStreamReader(cssmin.openConnection()
        .getInputStream()), cssmin.getFile(), 1, null);
    Scriptable exports = (Scriptable) scope.get("exports", scope);
    Scriptable compressor = (Scriptable) exports.get("compressor", exports);
    Function fn = (Function) compressor.get("cssmin", compressor);
}
}
