public class dummy {
public static Repository load(URL repositoryUrl) throws MojoExecutionException {
    String repositoryAsString;
    Repository repository;
    try {
      repositoryAsString = IOUtils.toString(repositoryUrl, "UTF-8");
    } catch (IOException ex) {
      throw new MojoExecutionException("ERROR: Could not download repository from url " + Utils.quote(repositoryUrl), ex);
    } 
    try {
      repository = (Repository)(new Gson()).fromJson(repositoryAsString, Repository.class);
    } catch (JsonSyntaxException ex) {
      throw new MojoExecutionException("ERROR: Failed to parse repository json " + repositoryAsString, ex);
    } 
    repository.drivers = Utils.sortDrivers(repository.drivers);
    return repository;
  }
}