package fr.cpe;

import java.util.List;

import javax.ejb.Local;
import fr.cpe.IAdditionRestService;

@Local
public interface IAddition {
	double sayaddition(List<Double> list);
}
