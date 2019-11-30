# Spring Cloud Kubernetes Config Example

## Versions used
- Kubernetes 1.16
- Minikube 1.5.2
- Docker 19.03.4
- Skaffold 1.0.0
- Spring Boot 2.2.1.RELEASE
- Spring Cloud Kubernetes Config 1.1.0.RELEASE


## Commands
- `skaffold run` - For build and run
- `kubectl apply -f config.yaml` - For applying the ConfigMap changes
- `kubectl describe configmap config-example` - For describing the contents of Config Map
- `kubectl logs <pod_name> -f` - For tailing the logs from the pod