package belenaprende.com.pruebasanotaciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// esta clase se va a usar en vez del archivo de configuracion xml que es donde se le dice a Spring, donde tiene que buscar los beans. 

//aqui hay que decirle a Spring que esta clase es la que configura el bean. Luego hay que ir a la clase principal y ya no ponerle classpathxml, sino otra cosa 
@Configuration
@ComponentScan("belenaprende.com.pruebasanotaciones")
@PropertySource("classpath:datosEmpresa.propiedades") // para poner propiedades y valores ya no desde un xml sino desde
														// una clase java. hacer lo mismo que para el xml, crear un file
														// donde poner las propiedades y valores y con esta anotacion
														// decirle donde esta el archivo
public class EmpleadosConfig {

	// definir el bean para informeFindptoCompras

	@Bean
	public ICreacionInformeFinanciero2 informeFinancieroDptoCompras() // el nombre del metodo es muy importante por que
																		// va a servir de ID del bean!!!
	{
		return new InformeFinDptoCompras();

	}

	// definir el bean para un directorFinanciero y inyectarlos

	@Bean
	public IEmpleado directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDptoCompras()); // este constructor recibe in objeto tipo
																		// ICreacion.... es decir un bean!! y cual es el
																		// ID del bean de la interface ICreacblabla.
																		// pues el pripio metodo
																		// informefinancierodptocompras que era el ID
																		// del bean de esa clase!!!!
	}
}
