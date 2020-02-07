#!/bin/sh

cd main \
    && java-select 8 \
    && mvn install -DskipTests \
    && cd ../example \
    && java-select 11 \
    && mvn verify
