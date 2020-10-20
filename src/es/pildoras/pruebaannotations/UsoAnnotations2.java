package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml"); // Lee el .xml
		
		AnnotationConfigApplicationContext contexto = new  AnnotationConfigApplicationContext(EmpleadosConfig.class); // Lee el .class
		
//		Empleados Reese = contexto.getBean("comercialExp", Empleados.class);
//		Empleados Jack = contexto.getBean("comercialExp", Empleados.class);
//		
//		if(Reese == Jack) { // Evaluamos
//			System.out.println("Apuntan al mismo lugar en memoria"); 
//			System.out.println(Reese + "\n" + Jack);
//		} else {
//			System.out.println("No apuntan al mismo lugar en memoria");
//			System.out.println(Reese + "\n" + Jack);
//		}
		
		
		Empleados Luis = contexto.getBean("directorFinanciero", Empleados.class); // Pedimos el bean
		
		System.out.println(Luis.getTareas());
		System.out.println(Luis.getInforme());

/*		DirectorFinanciero Luis = contexto.getBean("directorFinanciero", DirectorFinanciero.class); // utilizando la clase también es posible :)
		
		System.out.println(Luis.getTareas());
		System.out.println(Luis.getInforme());*/
		
		
		contexto.close();
		
	}
}


/*
	ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml"); // Lee el .xml
	AnnotationConfigApplicationContext contexto = new  AnnotationConfigApplicationContext(EmpleadosConfig.class); // Lee el .class
		
	Al igual que cuando configuramos el enlace a un xml se debe hacerlo con el class, utilizando AnnotationConfig...
		
*/





