public class dummy {
public void execute() throws MojoExecutionException, MojoFailureException {
        UsernamePasswordCredentials credentials = getCredentials(serverId);
        if (credentials == null) {
        	LOGGER.warn("No server configured with id '{}'.  Will be unable to authenticate.", serverId);
        }
        String buildNumberFormat = "\\d.*\\.\\d.*[d|p]";
        if (!buildNumber.matches(buildNumberFormat)) {
            throw new MojoExecutionException(String.format(
                "buildNumber '%s' must take the form [major].[minor].[d|p].  e.g., 4.1d",
                buildNumber, buildNumberFormat));
        }
        httpWorker = new HttpRequestManager(HOST, credentials, settings.getActiveProxy());
        Downloads dl = new Downloads(httpWorker);
        try {
        	httpWorker.login();
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        dateFormat.setLenient(false);
	        if (buildDate == null) {
	            Distribution d = Distribution.get(product, license);
	            LOGGER.info("No buildDate provided.  Contacting Isomorphic build server to "
	                + "look for the most recent distribution...");
	            String link = dl.findCurrentBuild(d, buildNumber);
	            if (link == null) {
	                throw new MojoExecutionException("No build found for the given distribution.");
	            }
	            LOGGER.debug("Extracting date from server response: '{}'", link);
	            buildDate = StringUtils.substringAfterLast(link, "/");
	            LOGGER.info("buildDate set to '{}'", buildDate);
	        }
            dateFormat.parse(buildDate);
	        File basedir = FileUtils.getFile(workdir, product.toString(), license.toString(),
	            buildNumber, buildDate);
	        List<License> licenses = new ArrayList<License>();
	        licenses.add(license);
	        if (license == POWER || license == ENTERPRISE) {
	            if (includeAnalytics) {
	                licenses.add(ANALYTICS_MODULE);
	            }
	            if (includeMessaging) {
	                licenses.add(MESSAGING_MODULE);
	            }
	        }
	        Set<Module> artifacts = collect(licenses, basedir);
	        String[] executables = { "bat", "sh", "command" };
	        Collection<File> scripts = FileUtils.listFiles(basedir, executables, true);
	        if (copyToLatestFolder) {
		        File bookmarkable = new File(basedir.getParent(), "latest");
		        LOGGER.info("Copying distribution to '{}'", bookmarkable.getAbsolutePath());
		        try {
		            FileUtils.forceMkdir(bookmarkable);
		            FileUtils.cleanDirectory(bookmarkable);
		            FileUtils.copyDirectory(basedir, bookmarkable,
		                FileFilterUtils.notFileFilter(FileFilterUtils.nameFileFilter("zip")));
		            scripts.addAll(FileUtils.listFiles(bookmarkable, executables, true));
		        } catch (IOException e) {
		            throw new MojoFailureException("Unable to copy distribution contents", e);
		        }	        	
	        }
	        for (File script : scripts) {
	            script.setExecutable(true);
	            LOGGER.debug("Enabled execute permissions on file '{}'", script.getAbsolutePath());
	        }
	        doExecute(artifacts);
        } catch (ParseException e) {
            throw new MojoExecutionException(String.format(
                "buildDate '%s' must take the form yyyy-MM-dd.", buildDate));
        } finally {
            httpWorker.logout();        	
        }    
    }
}