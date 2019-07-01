FROM airhacks/glassfish
COPY ./target/test.war ${DEPLOYMENT_DIR}
