package belenaprende.com.pruebasanotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotaciones {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("applicationContext.xml");
		IEmpleado empleado = (IEmpleado) cont.getBean("IDDelBean", IEmpleado.class);

		System.out.println(empleado.getTareas());
		cont.close();
	}

}
