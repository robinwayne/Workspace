package fr.cpe.impl;

import org.jboss.logging.Logger;

import java.util.List;

import javax.inject.Inject;

import fr.cpe.IAddition;
import fr.cpe.IAdditionRestService;


public class AdditionRestService implements IAdditionRestService{
	
	Logger logger = Logger.getLogger(AdditionRestService.class.getName());
	
	@Inject
	private IAddition additionService;
	
	@Override
	public Double addition(List<Double> value){
		logger.info(">>> addition()" + value);
		
			return additionService.sayaddition(value);
			
		
		
	}
}