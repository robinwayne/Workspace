package fr.cpe.impl;

import java.util.List;

import


public class AdditionRestService implements IAdditionRestService{
	
	public Double sayaddition(List<Double> value){
		
		return value.stream().mapToDouble(Double::doubleValue).sum();
	}
}