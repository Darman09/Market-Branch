# Build
mvn clean package && docker build -t com.mycompany/test .

# RUN

docker rm -f test || true && docker run -d -p 8080:8080 -p 4848:4848 --name test com.mycompany/test 