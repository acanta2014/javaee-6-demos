package es.rchavarria.springmvc.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import es.rchavarria.springmvc.core.services.PropertyService;
import es.rchavarria.springmvc.rest.domain.Property;

@Controller
@RequestMapping("/properties")
public class PropertiesCommandsController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(PropertiesCommandsController.class);
	
	@Autowired
	private PropertyService propertyService;

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteProperty(@PathVariable String id) {
		LOGGER.info("deleting property with id: " + id);
		propertyService.deleteProperty(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Property> createProperty(@RequestBody Property property) {
		LOGGER.info("creating property: " + property.toString());
		propertyService.createProperty(property);
		
		return new ResponseEntity<Property>(HttpStatus.OK);
	}
}
