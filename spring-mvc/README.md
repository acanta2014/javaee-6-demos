# restfulmvc

In this demo, we will create an application to show the use 
of the Spring MVC framework for creating RESTful services.

It will be a simple web application, without persistence, but a
complete Spring MVC application where, instead of render responses
with a JSP page, the response will be in JSON format, to be
consumed as a Web Service

# Instructions

The application will be a typical CRUD one, and it will manage a 
list of houses, flats, cottages, ... These kind of properties 
managed by a real state agency.

## Define URI's to access properties

We will have only one resource, a property, so we will only have
one URI to access it:

http://<server name>/springmvc/properties

We will use different HTTP methods to access properties:

- GET /properties: will return a list of properties
- GET /properties/{id}: will return details of the property identified by
{id}
- POST /properties: will create a new property
- DELETE /properties/{id]: will delete property identified by {id}
- PUT /properties/{id]: will update a property

# Create an empty MVC controller to reply to queries (list and get)

The controller that will reply to queries will be named:

	es.rchavarria.springmvc.rest.PropertiesQueriesController

It will reply to HTTP requests querying for data such a list of
properties or details of a property.

Annotate the controller so that Spring knows that the class is a 
controller and what URI's and HTTP methods it will handle. The result
will be something like this:

	// imports...
		
	@Controller
	@RequestMapping("/properties")
	public class PropertiesQueriesController {
	
		@RequestMapping(method = RequestMethod.GET)
		@ResponseStatus(HttpStatus.OK)
		@ResponseBody
		public List<String> getAllProperties() {
			return Arrays.asList("one", "two", "three");
		}
	}

## Create tests to exercise the query controller



## Steps

- Implement the controller
- Create an empty MVC controller to reply to commands (create, delete 
and update)
- Create tests to exercise the controller
- Implement it

# Resources

http://spring.io/guides/tutorials/rest
