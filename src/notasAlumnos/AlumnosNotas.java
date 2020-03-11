package notasAlumnos;

public class AlumnosNotas {
	public String nombre;
	public String apellido;
	public String legajo;
	public int notaDeMatematica;
	public int notaDeLengua;
	public int notaDeProgramacion;
	public int promedio;
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
	public void setPromedio( ) {
		this.promedio = (getNotaDeProgramacion() + getNotaDeLengua() + getNotaDeMatematica() )/3;
	}
	
	public void Mostrarmensajedeaprobacion() {
		if(getPromedio()<6) {
			System.out.println("El alumno no esta aprobado "+getNombre());
		}
		if(getPromedio()>9) {
			System.out.println("El alumno es destacado");
		}
		if(getPromedio()>6) {
			System.out.println("El alumno esta aprobado");
		}
}
	
		    	  
}
	        
	           
	

