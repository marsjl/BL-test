
FROM ubuntu:16.04



LABEL "Maintainer"="mdocid"



RUN apt-get update && apt-get install -y python-software-properties software-properties-common


RUN apt-get install -y iputils-ping


RUN add-apt-repository ppa:webupd8team/java


RUN apt-get install -y vim
RUN apt-get install -y mysql-client


RUN echo "oracle-java8-installer shared/accepted-oracle-license-v1-1 boolean true" | debconf-set-selections


RUN apt-get update && apt-get install -y oracle-java8-installer maven


ADD . /usr/local/org-bl-docker-test


RUN cd /usr/local/org-bl-docker-test && mvn assembly:assembly


CMD ["java", "-cp", "/usr/local/org-bl-docker-test/target/org-bl-docker-test-0.0.1-SNAPSHOT-jar-with-dependencies.jar", "org.bl.docker.test.orgbldockertest.OrgBlDockerTestApplication"]