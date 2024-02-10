package IoC;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//creacion de objetos de tipo empleado 	

		Empleados empleado1 = new JefeEmpleado();
		Empleados empleado2 = new SecretarioEmpleado();
		//uso de los objetos creados//
		System.out.println("tarea del Jefe:"+empleado1.getTareas());
		System.out.println("tarea del Secretario:"+empleado2.getTareas());
	}

}
