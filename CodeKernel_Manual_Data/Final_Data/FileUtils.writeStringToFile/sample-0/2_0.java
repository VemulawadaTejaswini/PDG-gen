public class dummy {

public synchronized String submitBatchJob(JobDescriptor jobDescriptor) throws SSHApiException {
        TransformerFactory factory = TransformerFactory.newInstance();
        URL resource = this.getClass().getClassLoader().getResource(jobManagerConfiguration.getJobDescriptionTemplateName());

        if (resource == null) {
            String error = "System configuration file '" + jobManagerConfiguration.getJobDescriptionTemplateName()
                    + "' not found in the classpath";
            throw new SSHApiException(error);
        }

        Source xslt = new StreamSource(new File(resource.getPath()));
        Transformer transformer;
        StringWriter results = new StringWriter();
        File tempPBSFile = null;
        try {
            // generate the pbs script using xslt
            transformer = factory.newTransformer(xslt);
            Source text = new StreamSource(new ByteArrayInputStream(jobDescriptor.toXML().getBytes()));
            transformer.transform(text, new StreamResult(results));
            String scriptContent = results.toString().replaceAll("^[ |\t]*\n$", "");
            if (scriptContent.startsWith("\n")) {
                scriptContent = scriptContent.substring(1);
            }
//            log.debug("generated PBS:" + results.toString());

            // creating a temporary file using pbs script generated above
            int number = new SecureRandom().nextInt();
            number = (number < 0 ? -number : number);

            tempPBSFile = new File(Integer.toString(number) + jobManagerConfiguration.getScriptExtension());
            FileUtils.writeStringToFile(tempPBSFile, scriptContent);

            //reusing submitBatchJobWithScript method to submit a job
            String jobID = null;
            int retry = 3;
            while(retry>0) {
                try {
                    jobID = this.submitBatchJobWithScript(tempPBSFile.getAbsolutePath(),
                            jobDescriptor.getWorkingDirectory());
                    retry=0;
                } catch (SSHApiException e) {
                    retry--;
                    if(retry==0) {
                        throw e;
                    }else{
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                        log.error("Error occured during job submission but doing a retry");
                        e.printStackTrace();
                    }
                }
            }
            log.debug("Job has successfully submitted, JobID : " + jobID);
            if (jobID != null) {
                return jobID.replace("\n", "");
            } else {
                return null;
            }
            } catch (TransformerConfigurationException e) {
            throw new SSHApiException("Error parsing PBS transformation", e);
        } catch (TransformerException e) {
            throw new SSHApiException("Error generating PBS script", e);
        } catch (IOException e) {
            throw new SSHApiException("An exception occurred while connecting to server." +
                    "Connecting server - " + serverInfo.getHost() + ":" + serverInfo.getPort() +
                    " connecting user name - "
                    + serverInfo.getUserName(), e);
        } finally {
            if (tempPBSFile != null) {
                tempPBSFile.delete();
            }
        }
    }

}