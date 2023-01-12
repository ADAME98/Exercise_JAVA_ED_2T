package es.studium.ejerciciosBoletinPOO3;

public class Empleado {
	private int idEmpleado;
	private String nombreEmpleado;
	private String apellidoEmpleado;
	private Departamento departamento;
	
	public Empleado() {
		idEmpleado = 0;
		nombreEmpleado = "";
		apellidoEmpleado = "";
		departamento = new Departamento();		
	}

	public Empleado(int idEmpleado, String nombreEmpleado, String apellidoEmpleado, Departamento departamento) {
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apellidoEmpleado = apellidoEmpleado;
		this.departamento = departamento;
	}

	public Empleado(String nombreEmpleado, String apellidoEmpleado, Departamento departamento) {
		
		this.nombreEmpleado = nombreEmpleado;
		this.apellidoEmpleado = apellidoEmpleado;
		this.departamento = departamento;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}

	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	
}
