package es.studium.ejerciciosBoletinPOO;

public class Principal {
	public static void main(String[] args) {
		// Crear objetos de tipo Raza
		Raza raza1 = new Raza("Poodle");
		Raza raza2 = new Raza("Golden Retriever");
		Raza raza3 = new Raza("Bulldog");

		// Crear objetos de tipo Perro
		Perro perro1 = new Perro(raza1, 12, 4, "Blanco");
		Perro perro2 = new Perro(raza2, 20, 2, "Dorado");
		Perro perro3 = new Perro(raza3, 15, 6, "Negro");
		Perro perro4 = new Perro(raza1, 10, 3, "Gris");
		Perro perro5 = new Perro(raza2, 25, 1, "Marrón");

		// Imprimir información de los perros
		System.out.println(
				"La raza del perro 1 es: " + perro1.getRaza().getNombreRaza() + ", su tamaño es: " + perro1.getTamano()
						+ "cm, su edad es: " + perro1.getEdad() + " años y es de color: " + perro1.getColor() + ".");
		System.out.println(
				"La raza del perro 2 es: " + perro2.getRaza().getNombreRaza() + ", su tamaño es: " + perro2.getTamano()
						+ "cm, su edad es: " + perro2.getEdad() + " años y es de color: " + perro2.getColor() + ".");
		System.out.println(
				"La raza del perro 3 es: " + perro3.getRaza().getNombreRaza() + ", su tamaño es: " + perro3.getTamano()
						+ "cm, su edad es: " + perro3.getEdad() + " años y es de color: " + perro3.getColor() + ".");
		System.out.println(
				"La raza del perro 4 es: " + perro4.getRaza().getNombreRaza() + ", su tamaño es: " + perro4.getTamano()
						+ "cm, su edad es: " + perro4.getEdad() + " años y es de color: " + perro4.getColor() + ".");
		System.out.println(
				"La raza del perro 5 es: " + perro5.getRaza().getNombreRaza() + ", su tamaño es: " + perro5.getTamano()
						+ "cm, su edad es: " + perro5.getEdad() + " años y es de color: " + perro5.getColor() + ".");

	}

}
