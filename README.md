[![Build Status](https://travis-ci.com/claudioaltamura/quarkus-openapi-generator.svg?branch=master)](https://travis-ci.com/claudioaltamura/quarkus-openapi-generator)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

# quarkus-openapi-generator
Quarkus OpenAPI Generator example

## Running the application in dev mode

```shell script
./mvnw compile quarkus:dev
```

## Swagger UI

    http://localhost:8080/q/swagger-ui

## examples

    curl -X GET http://localhost:8080/pets

    curl -X GET http://localhost:8080/pets/1

    curl -X POST http://localhost:8080/pets