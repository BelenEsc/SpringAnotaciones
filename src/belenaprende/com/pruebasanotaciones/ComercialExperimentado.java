package belenaprende.com.pruebasanotaciones;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("IDDelBean") // gracias a esta anotacion en esta clase, spring ya sabe que se puede crean un
						// bean de esta clase
//@Scope("prototype")
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
	
	@PostConstruct  // cuando se usa postConstruct y predestroy no se puede usar el Scope = prototype // tiene 3 reglas, uso solo son singleton, no recibe argeumentos y casi siempre es void 
	public void ejecutaDespuesCreacion() {
		System.out.println("estos es despues de la crwacion del bean");
	}
	
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("estos es antes de la destruccion del bean");
	}
	

}
