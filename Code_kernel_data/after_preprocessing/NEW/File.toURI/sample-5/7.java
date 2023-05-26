//7
public class func{
public void getLocalUrl(MavenArtifact artifact){
        if (isInstalledLocally(artifact)) return new File(getLocalPath(artifact)).toURI().toString();
        if (artifact.isSnapshot()) return snapshotUrlGenerator.apply(artifact);
        else return releaseUrlGenerator.apply(artifact);
}
}
