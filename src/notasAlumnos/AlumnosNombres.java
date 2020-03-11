package notasAlumnos;

public class AlumnosNombres {

	public String nombre;
	public String apellido;
	public String legajo;
	public int notaDeMatematica;
	public int notaDeLengua;
	public int notaDeProgramacion;
	public int promedio;
	public AlumnosNombres(String unNombre, String unApellido, String unLejago, int notaMat, int notaLeng, int notaProgra) {
		this.nombre = unNombre;
		this.apellido = unApellido;
		this.legajo = unLejago;
		this.notaDeMatematica = notaMat;
		this.notaDeLengua = notaLeng;
		this.notaDeProgramacion = notaProgra;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public int getNotaDeMatematica() {
		return notaDeMatematica;
	}
	public void setNotaDeMatematica(int notaDeMatematica) {
		this.notaDeMatematica = notaDeMatematica;
	}
	public int getNotaDeLengua() {
		return notaDeLengua;
	}
	public void setNotaDeLengua(int notaDeLengua) {
		this.notaDeLengua = notaDeLengua;
	}
	public int getNotaDeProgramacion() {
		return notaDeProgramacion;
	}
	public void setNotaDeProgramacion(int notaDeProgramacion) {
		this.notaDeProgramacion = notaDeProgramacion;
	}
	public float getPromedio() {
		return promedio;
	}
	public float promedio() {
		return  (getNotaDeLengua() + getNotaDeMatematica() + getNotaDeProgramacion())/3;	
	}
	public void estadoAlumno() {
		if(promedio()<6.0) {
			System.out.println("El alumno "+ getNombre() +" no aprobo, su promedio es: "+ promedio());
		}else {
			if(promedio()>=9) {
				System.out.println("El alumno "+ getNombre()+ " es destacado con un promedio de "+promedio());
			}else {
				System.out.println("El alumno "+getNombre()+" esta aprobado, con una nota de: " + promedio());
			}
		}
		
	}
	
}
