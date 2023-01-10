package es.studium.ejerciciosBoletinPOO;

public class Raza {

	   private String nombreRaza;
	    
	    //Métodos constructores
	    public Raza() {
	        //Constructor vacío
	    }
	    
	    public Raza(String nombreRaza) {
	        this.nombreRaza = nombreRaza;
	    }
	    
	    //Métodos inspectores (Getters)
	    public String getNombreRaza() {
	        return nombreRaza;
	    }
	    
	    //Métodos modificadores (Setters)
	    public void setNombreRaza(String nombreRaza) {
	        this.nombreRaza = nombreRaza;
	    }
}
