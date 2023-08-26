package belenaprende.com.pruebasanotaciones;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnotaciones2 {

	public static void main(String[] args) {

//		ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("applicationContext.xml"); //comentado por que a partir de aqui se usó una clase java de configuracion y ya no xml
		
		// leer la clase java de configuracion
		
		AnnotationConfigApplicationContext cont = new AnnotationConfigApplicationContext(EmpleadosConfig.class); //en los parametros hay que decirle el archivo clase
		
		// pedir beans al contenedor 
//		IEmpleado empleado = cont.getBean( "directorFinanciero",DirectorFinanciero.class);
		DirectorFinanciero empleado = cont.getBean( "directorFinanciero",DirectorFinanciero.class);
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInformes());
		System.out.println(empleado.getEmail());
		System.out.println(empleado.getNombreEmpresa());
		
		
//		IEmpleado empleado = (IEmpleado) cont.getBean("IDDelBean", IEmpleado.class);
//
//		System.out.println(empleado.getTareas());
		cont.close();
	}
}
