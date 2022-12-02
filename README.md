# ttn-java-model
A Jackson based java model for the current The Thinks Network Webhook.

The model has been constructed by reverse engineering example calls to 
my API. So there is margin for error.

# Beware
The model is generic and does not implement decoded payload. But because it
is present it is important to configure Jackson not to fail on unknown 
properties. You will also need to add JavaTimeModule to the mapper. 

# MapperFactory 
A Jackson Mapper known to work can be obtained by using the Factory
provided with this model.

# Jackson
The Jackson stuff has scope provided in this project! 


