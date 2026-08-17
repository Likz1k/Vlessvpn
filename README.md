# CrossCobweb

Paper 1.21.11 plugin.

## Recipe

```text
S   S
  S
S   S
```

5x STRING -> 1x COBWEB.

## Build locally

```bash
mvn clean package
```

The plugin JAR will be:

`target/CrossCobweb.jar`

## Build on GitHub

Push the repository to GitHub. The workflow in `.github/workflows/build.yml`
builds the plugin automatically.

You can also start it manually:

GitHub -> Actions -> Build CrossCobweb -> Run workflow.

After the build finishes, open the workflow run and download the
`CrossCobweb` artifact.
