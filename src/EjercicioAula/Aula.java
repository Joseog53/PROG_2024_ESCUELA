package EjercicioAula;

import java.util.Arrays;

public class Aula {

	private Alumno[] alumnos;
	private int caben;
	private int contadorAlum;

	public Aula(int caben) {
		this.caben = caben;
		this.alumnos = new Alumno[caben];
		this.contadorAlum = 0;
	}

	public void agregarAlumno(Alumno alumno) {
		if (contadorAlum < caben) {
			contadorAlum++;

			System.out.println("agregado correctamente a la clase");

		}

		else {

			System.out.println("El aula está llena. No se pueden agregar más alumnos.");
		}
	}

}
