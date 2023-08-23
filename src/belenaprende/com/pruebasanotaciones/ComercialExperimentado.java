package belenaprende.com.pruebasanotaciones;

import org.springframework.stereotype.Component;

@Component("IDDelBean") // gracias a esta anotacion en esta clase, spring ya sabe que se puede crean un
						// bean de esta clase

public class ComercialExperimentado implements IEmpleado {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "vender, vender y seguir vendiendo hasta morir";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "informe generado por el vendedor";
	}

}
