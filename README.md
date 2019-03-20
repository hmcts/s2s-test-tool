# S2S-token-provider

Service to help automate S2S authetication

## Purpose

Provides professional reference data to client applications.  Implemented as a Java/SpringBoot application.

### Prerequisites

To run the project you will need to have the following installed:

* Java 8
* Docker (optional)

For information about the software versions used to build this API and a complete list of it's dependencies see build.gradle

### Environment Vars

If running locally for development or testing you will need to set the following environment variables

idam.s2s-auth.totp_secret=[some-secret]

### Running the application

To run the API quickly use the docker helper script as follows:


```
gradle clean build
docker build [image-name] .
docker run [image-name]
```