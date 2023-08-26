package belenaprende.com.pruebasanotaciones;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements IEmpleado {


	private ICreacionInformeFinanciero2 informe;

	// en la clase donde se quiere definir las propiedades ("importar") se
	// construyen los campos de clase.
	@Value("${email}") // ahora decirle que inyecte en email el valor correspondiente al campo email en
						// el archivo file
	private String email;
	@Value("${nombreEmpresa}") // hacer lo mismo para el campo de clase nombreEmpresa con la anotacion value 
	private String nombreEmpresa;

	public DirectorFinanciero(ICreacionInformeFinanciero2 informe) {
		super();
		this.informe = informe;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "las tareas de un director son gestiones, operaciones financieras y despedir gente";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return informe.getInformeFinanciero() + " este es el informe del director financiero";
	}

}
