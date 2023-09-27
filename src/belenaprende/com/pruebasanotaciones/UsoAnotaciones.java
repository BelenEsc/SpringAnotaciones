package belenaprende.com.pruebasanotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotaciones {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("applicationContext.xml");
		IEmpleado empleado = (IEmpleado) cont.getBean("comercialExperimentado", IEmpleado.class); // en el caso de NO
																									// poder un Id en la
																									// clase de donde
																									// viene la
																									// dependencia (o
																									// sea @Component
																									// esta vacio) hay
																									// que poner el
																									// nombre de la
																									// clase de donde se
																									// quiere crear un
																									// bean con la
																									// primera letra en
																									// minsíscula

		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInformes());
		cont.close();
	}

}
