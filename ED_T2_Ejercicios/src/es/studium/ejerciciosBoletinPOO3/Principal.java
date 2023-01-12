package es.studium.ejerciciosBoletinPOO3;

public class Principal {

	public static void main(String[] args) {
		CentroDeTrabajo centroDeTrabajo1 = new CentroDeTrabajo("Bengala", "C/Militao nº4");
		Departamento departamento1 = new Departamento("Contabilidad", centroDeTrabajo1);
		Empleado empleado1 = new Empleado("Manolo", "Ramirez", departamento1);

		CentroDeTrabajo centroDeTrabajo2 = new CentroDeTrabajo("Hispa", "C/Feliciano nº45");
		Departamento departamento2 = new Departamento("Comercial", centroDeTrabajo2);
		Empleado empleado2 = new Empleado("Fernando", "Gonzalez", departamento2);

		CentroDeTrabajo centroDeTrabajo3 = new CentroDeTrabajo("Asus", "C/España nº23");
		Departamento departamento3 = new Departamento("Contabilidad", centroDeTrabajo3);
		Empleado empleado3 = new Empleado("Javier", "Adame", departamento3);

		CentroDeTrabajo centroDeTrabajo4 = new CentroDeTrabajo("Apple", "C/pepito nº1");
		Departamento departamento4 = new Departamento("logistica", centroDeTrabajo4);
		Empleado empleado4 = new Empleado("Esteban", "Contes", departamento4);

		CentroDeTrabajo centroDeTrabajo5 = new CentroDeTrabajo("HP", "C/Militao nº4");
		Departamento departamento5 = new Departamento("comercial", centroDeTrabajo5);
		Empleado empleado5 = new Empleado("Gerardo", "Fernandez", departamento5);

		System.out.println("El trabajador " + empleado1.getNombreEmpleado() + " " + "trabaja en el departamento "
				+ empleado1.getDepartamento().getNombreDepartamento() + "que pertenece al centro de trabajo "
				+ empleado1.getDepartamento().getCentroDeTrabajo().getNombreCentroTrabajo() + ".");

		System.out.println("El trabajador " + empleado2.getNombreEmpleado() + " " + "trabaja en el departamento "
				+ empleado2.getDepartamento().getNombreDepartamento() + "que pertenece al centro de trabajo "
				+ empleado2.getDepartamento().getCentroDeTrabajo().getNombreCentroTrabajo() + ".");

		System.out.println("El trabajador " + empleado3.getNombreEmpleado() + " " + "trabaja en el departamento "
				+ empleado3.getDepartamento().getNombreDepartamento() + "que pertenece al centro de trabajo "
				+ empleado3.getDepartamento().getCentroDeTrabajo().getNombreCentroTrabajo() + ".");

		System.out.println("El trabajador " + empleado4.getNombreEmpleado() + " " + "trabaja en el departamento "
				+ empleado4.getDepartamento().getNombreDepartamento() + "que pertenece al centro de trabajo "
				+ empleado4.getDepartamento().getCentroDeTrabajo().getNombreCentroTrabajo() + ".");

		System.out.println("El trabajador " + empleado5.getNombreEmpleado() + " " + "trabaja en el departamento "
				+ empleado5.getDepartamento().getNombreDepartamento() + "que pertenece al centro de trabajo "
				+ empleado5.getDepartamento().getCentroDeTrabajo().getNombreCentroTrabajo() + ".");

	}
}
