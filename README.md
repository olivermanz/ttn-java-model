# ttn-java-model
A Jackson based java model for the current The Thinks Network Webhook.

The model has been constructed by reverse engineering example calls to 
my API. So there is margin for error.

# Payload
The model is generic. Decoded payload is implemented as JsonNode so that it
can handle different types of sensors.  

# MapperFactory 
A Jackson Mapper known to work can be obtained by using the Factory
provided with this model. If you want to generate your own : it is a good idea to
set FAIL_ON_UNKNOWN_PROPERTIES to false since there maybe additional fields that 
I did not catch while building the model.

# Jackson
The Jackson stuff has scope provided in this project! 


