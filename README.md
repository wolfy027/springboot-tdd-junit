#springboot-tdd-junit
- Spring: Test Driven Development with Junit

## Unit Testing Objectives
We will writing contact management unit test code with the purpose of just testing the contact management service. In particular, the add contact method. Since we're isolating our testing to just the service component unit, we are going to mock our data access component. So for this test, we'll see something that we didn't have to worry about in our integration test. 

## Controller Testing Objectives
 This is an integration test which means all components are real and no mocks involved at this stage of testing. We want to test what happens when a real contact management controller interacts with a real contact management service and when that contact management service accesses real data access components
