# Docker Sample

Demo Project is a little example of how to Dockerize your java app

## Installation

First of all, you need to install [Docker](https://www.docker.com/products)

## Usage

We need to add a Dockerfile in our project
```properties
FROM openjdk:11
ADD build/libs/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
```

Build a jar (with your favorite IDE o just in command line).\
In this case the jar file name is **demo-0.0.1-SNAPSHOT.jar**

Build your Docker image
```bash
docker build . -t demo
```

Check that image was created
```bash
docker images
```

Run Docker image
```bash
docker run -p 8086:8086 --name demo -d demo
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.