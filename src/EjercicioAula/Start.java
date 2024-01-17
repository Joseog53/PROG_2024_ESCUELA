package EjercicioAula;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Aula aula = new Aula(3);

        
        Alumno alumno1 = new Alumno("Juan", 20);
        Alumno alumno2 = new Alumno("María", 21);
        Alumno alumno3 = new Alumno("Carlos", 22);
        Alumno alumno4 = new Alumno("Laura", 20);

       
        aula.agregarAlumno(alumno1);
        System.out.println(alumno1);
        
        aula.agregarAlumno(alumno2);
        System.out.println(alumno2);
        
        aula.agregarAlumno(alumno3);
        System.out.println(alumno3);

        aula.agregarAlumno(alumno4);
        System.out.println(alumno4);

        
        
    }
}
