public class dummy {

public String tail() {
        if (!this.stable()) {
            throw new DeploymentException(
                String.format(
                    "env '%s' is not stable, can't get TAIL report",
                    this.eid
                )
            );
        }
        if (this.terminated()) {
            throw new DeploymentException(
                String.format(
                    "env '%s' is terminated, can't get TAIL report",
                    this.eid
                )
            );
        }
        this.client.requestEnvironmentInfo(
            new RequestEnvironmentInfoRequest()
                .withEnvironmentId(this.eid)
                .withInfoType(EnvironmentInfoType.Tail)
        );
        final RetrieveEnvironmentInfoRequest req =
            new RetrieveEnvironmentInfoRequest()
                .withEnvironmentId(this.eid)
                .withInfoType(EnvironmentInfoType.Tail);
        List<EnvironmentInfoDescription> infos;
        final long start = System.currentTimeMillis();
        do {
            if (System.currentTimeMillis() - start > Environment.MAX_DELAY_MS) {
                throw new DeploymentException(
                    String.format(
                        "env '%s' doesn't report its TAIL, time out",
                        this.eid
                    )
                );
            }
            Logger.info(
                this,
                "Waiting for TAIL report of %s",
                this.eid
            );
            infos = this.client
                .retrieveEnvironmentInfo(req)
                .getEnvironmentInfo();
        } while (infos.isEmpty());
        final EnvironmentInfoDescription desc = infos.get(0);
        try {
            return IOUtils.toString(new URL(desc.getMessage()).openStream());
        } catch (java.io.IOException ex) {
            throw new IllegalStateException(ex);
        }
    }

}