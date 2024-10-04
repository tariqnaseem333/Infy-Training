# Infy-Training
## It is a Java Enterprise Application maven based project using various concepts of OOPs, Java API(Regex API, DateTime API, Collection Framework), Java SE8 Features and use Tools(Properties File, Logging log4j2, JUNIT). 
### Infosys wants to automate the process of adding the trainees and also interested in generating the report of all trainees who have provided a particular Id Proof. In this project, two operations are performed
### 1.) Add Trainee
### 2.) Generate Trainee Report

#### The different steps taking place in the application are explained below:- 
##### 1.) User inputs the data in Tester Class (Presentation Tier). In this project, the client tier is not used. the inputs will be taken directly in the Tester Class.
##### 2.) The Tester class sends the Model class object to the Service Class (Business Tier).
##### 3.) The Service class sends the object to the Validator class to get the inputs validated. 
##### 4.) If the inputs are in valid format, the data is send to the DAO class (Persistence Tier) to store it in the database. In this project, the database is not being used simply a messsage will be returned from the database.
##### 4.) The Service class also performs operations like adding Trainee after validation, generating mailId for Trainee and getting Trainee report based on Id proof from DAO class (Persistence Tier). In this project, the database is not being used a hard coded data will be returned.
##### 5.) Based on the responses from the Validator and the DAO classes, the Service class formulates  either a successful output or a failure output and return the same to the Tester class.
##### 6.) The Tester class then displays the output to the User.
