package es.pildoras.pruebaannotations;

public class DirectorFinanciero implements Empleados {

	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gesti�n y direccion de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}
	
	private CreacionInformeFinanciero informeFinanciero;

}
