package belenaprende.com.pruebasanotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//@Component("IDDelBean") // gracias a esta anotacion en esta clase, spring ya sabe que se puede crean un
// bean de esta clase
//@Scope("prototype")
			// que hacer referencia a la clase de la que se queire crear un bean.

public class ComercialExperimentado implements IEmpleado {

	@Autowired
	private ICreacionInformeFinanciero informeTrimestral;

	/*
	 * @Autowired // Spring sin q se vea, es buscar en todo el proyecto a ver si hay
	 * alguna clase // que implemente la clase ICreacionInfFinan... si la encuentra
	 * crea un bean de // esa clase public
	 * ComercialExperimentado(ICreacionInformeFinanciero informeTrimestral) {
	 * this.informeTrimestral = informeTrimestral; }
	 */

	/*
	 * @Autowired public void setInformeTrimestral(ICreacionInformeFinanciero
	 * informeTrimestral) { this.informeTrimestral = informeTrimestral; }
	 */

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "vender, vender y seguir vendiendo hasta morir";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return informeTrimestral.getInformeFinanciero();
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
