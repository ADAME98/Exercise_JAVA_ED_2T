package es.studium.ejerciciosBoletinPOO3;

public class Departamento {
	private int idDepartamento;
	private String nombreDepartamento;
	private CentroDeTrabajo CentroDeTrabajo;
	
	public Departamento() {
		idDepartamento = 0;
		nombreDepartamento = "";
		CentroDeTrabajo = new CentroDeTrabajo();
	}

	public Departamento(int idDepartamento, String nombreDepartamento,CentroDeTrabajo centroDeTrabajo) {
		this.idDepartamento = idDepartamento;
		this.nombreDepartamento = nombreDepartamento;
		this.CentroDeTrabajo = centroDeTrabajo;
	}

	public Departamento(String nombreDepartamento,CentroDeTrabajo centroDeTrabajo) {
		this.nombreDepartamento = nombreDepartamento;
		this.CentroDeTrabajo = centroDeTrabajo;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public CentroDeTrabajo getCentroDeTrabajo() {
		return CentroDeTrabajo;
	}

	public void setCentroDeTrabajo(CentroDeTrabajo centroDeTrabajo) {
		CentroDeTrabajo = centroDeTrabajo;
	}
	
	
	
	
		
		
	

}
