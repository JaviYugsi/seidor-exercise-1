# Exercise 2 - GitLab Service

## Description
This application has been thought to be an API Rest which comminicates with the GitLab Api in order to create a new Project with
2 branches and one tag


## Testing
Once executed the Docker file and running the new created image the application is available at port 8080.
The default entrypoint will redirect to the Sagger UI page so you can probe the funcionality.
In the application properties file you can find different variables which allow you to include your own GitLab account and personal token.
For demostration purposes you will find mine over there.

In case the construction of the Docker Image fails, you will have to build the .jar file outside of Dockerfile.


