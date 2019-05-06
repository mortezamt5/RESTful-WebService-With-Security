# RESTful-WebService-With-Security Using web.xml

# How To to Create RESTful Webservice with Security in JAVA using web.xml ? 

 You can secure RESTful Web Service using web.xml for Java EE Web Application . 
 For Example to secure your RESTful Web service using basic authentication, perform the following steps:
 
 1 - Define a <security-constraint> for each set of RESTful resources (URIs) that you plan to protect.

 2 - Use the <login-config> element to define the type of authentication you want to use and the security realm to which the security        constraints will be applied.

 3 - Define one or more security roles using the <security-role> tag and map them to the security constraints defined in step 1. For more    information, see "security-role" in Developing Applications with the WebLogic Security Service.

 4 - To enable encryption, add the <user-data-constraint> element and set the <transport-guarantee> subelement to CONFIDENTIAL. For more      information, see "user-data-constraint" in Developing Applications with the WebLogic Security Service.
 
 
 # Technologies and Tools used in this project:

- Jersey 1.8
- JDK 1.8
- Tomcat 8.0
- Maven 3.5.4
- Intelij 2018.1.3
