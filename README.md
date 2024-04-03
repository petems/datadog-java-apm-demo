# datadog-java-apm-demo

* Forked from https://github.com/nilushancosta/datadog-java-apm-demo
* Adding support for AMD64 and ARM64 images and adding curl to image for easier triggering of traces

## Building 

```
docker buildx build .   --platform linux/arm64,linux/amd64   --tag petems/datadog-java-apm-demo:latest   --push
```