package es.studium.ejerciciosBoletinPOO1;

import java.time.LocalDate;

public class Principal {
	public static void main(String[] args) {
		Director d1 = new Director("Alfred Hitchcock", LocalDate.of(1899, 8, 13), "Inglesa");
		Director d2 = new Director("Martin Scorsese", LocalDate.of(1942, 11, 17), "Estadounidense");
		Director d3 = new Director("Federico Fellini", LocalDate.of(1920, 1, 20), "Italiana");
		Director d4 = new Director("Akira Kurosawa", LocalDate.of(1910, 3, 23), "Japonesa");
		Director d5 = new Director("Ingmar Bergman", LocalDate.of(1918, 7, 14), "Sueca");

		Pelicula p1 = new Pelicula("Psicosis", 1960, 109.0f, d1);
		Pelicula p2 = new Pelicula("Taxi Driver", 1976, 113.0f, d2);
		Pelicula p3 = new Pelicula("La dolce vita", 1960, 174.0f, d3);
		Pelicula p4 = new Pelicula("Ran", 1985, 162.0f, d4);
		Pelicula p5 = new Pelicula("Fanny y Alexander", 1982, 188.0f, d5);

		// Imprimir el título, año, duración y el nombre y nacionalidad del director de
		// cada objeto de Pelicula
		System.out.println(
				"Pelicula: " + p1.getTitulo() + ", " + p1.getAnio() + " (" + p1.getDuracion() + " minutos), Director: "
						+ p1.getDirector().getNombre() + " (" + p1.getDirector().getNacionalidad() + ")");
		System.out.println(
				"Pelicula: " + p2.getTitulo() + ", " + p2.getAnio() + " (" + p2.getDuracion() + " minutos), Director: "
						+ p2.getDirector().getNombre() + " (" + p2.getDirector().getNacionalidad() + ")");
		System.out.println(
				"Pelicula: " + p3.getTitulo() + ", " + p3.getAnio() + " (" + p3.getDuracion() + " minutos), Director: "
						+ p3.getDirector().getNombre() + " (" + p3.getDirector().getNacionalidad() + ")");
		System.out.println(
				"Pelicula: " + p4.getTitulo() + ", " + p4.getAnio() + " (" + p4.getDuracion() + " minutos), Director: "
						+ p4.getDirector().getNombre() + " (" + p4.getDirector().getNacionalidad() + ")");
		System.out.println(
				"Pelicula: " + p5.getTitulo() + ", " + p5.getAnio() + " (" + p5.getDuracion() + " minutos), Director: "
						+ p5.getDirector().getNombre() + " (" + p5.getDirector().getNacionalidad() + ")");
		
		//Exercise-JAVA_ED_T1 DateTimeFormatter.ofPattern(dd/mm/aaaa);
	}
}