# HelloWorldApp

## Running the Application (Follow below commands):

1. git clone https://github.com/deshant19/HelloWorldApp.git 
2. cd HelloWorldApp
3. mvn clean package
4. cd ansible
5. ansible-playbook -i hosts playbook.yml

### Access the app using
curl 20.25.159.254:8080/helloworld (App hosted on Azure VM having public IP) - App no longer hosted on Azure
