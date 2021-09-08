package com.adobe.aem.guides.wknd.core.models;

import static org.apache.sling.api.resource.ResourceResolver.PROPERTY_RESOURCE_TYPE;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
  public class HelloWorldModel1 {
	  
	  @ValueMapValue(name=PROPERTY_RESOURCE_TYPE, injectionStrategy=InjectionStrategy.OPTIONAL)
	 private String itemText;

	public String getItemText() {
		return itemText;
	}

	  
	
  }
 