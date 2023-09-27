package belenaprende.com.pruebasanotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements ICreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "presentacion de informe financiero del trismestre 1: ";
	}

}
