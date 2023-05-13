public class dummy {

private void generateConfig(final FileInfo template, final FileInfo filter, final String outputBasePath,
            final StrSubstitutor strSubstitutor, final Map<String, Set<String>> missingPropertiesByFilename,
            final boolean missingPropertyFound) throws IOException, ConfigurationException, MojoFailureException {

        final String outputDirectory = createOutputDirectory(template, filter, outputBasePath);
        final String templateFilename = template.getFile().getName();
        final String outputFilename = FilenameUtils.separatorsToUnix(outputDirectory + templateFilename);

        if (configGeneratorParameters.isLogOutput()) {
            log.info("Creating : " + StringUtils.replace(outputFilename, outputBasePath, ""));
        } else if (log.isDebugEnabled()) {
            log.debug("Creating : " + String.valueOf(outputFilename));
        }
        log.debug("Applying filter : " + filter.toString() + " to template : " + template.toString());

        final String rawTemplate = FileUtils.readFileToString(template.getFile());
        final String processedTemplate = strSubstitutor.replace(rawTemplate);

        // No point in running regex against long strings if properties are all present
        if (missingPropertyFound) {
            checkForMissingProperties(filter.getFile().getAbsolutePath(), processedTemplate,
                    missingPropertiesByFilename);
        }

        // Only write out the generated io if there were no errors or errors are specifically ignored
        if (StringUtils.isNotBlank(configGeneratorParameters.getEncoding())) {
            FileUtils.writeStringToFile(new File(outputFilename), processedTemplate,
                    configGeneratorParameters.getEncoding());
        } else {
            FileUtils.writeStringToFile(new File(outputFilename), processedTemplate);
        }
    }

}