package examen_recuperacion_sando;

public class Estudiantes extends MainSistema {
	
	public String codigoBeca;
	public String nombre;
	public String apellido;
	//Notas
	
	public String colegio;
	public String fechaCumplea�os;
	//discapacidad
	public String discapacidad;
	public int recursos;
	//recursos
	public String beneficios;
	public int salirioPadres;
	
	
	//Metodos SET y GET
	public String getCodigoBeca() {
		return codigoBeca;
	}
	public void setCodigoBeca(String codigoBeca) {
		this.codigoBeca = codigoBeca;
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
	public String getColegio() {
		return colegio;
	}
	public void setColegio(String colegio) {
		this.colegio = colegio;
	}
	public String getFechaCumplea�os() {
		return fechaCumplea�os;
	}
	public void setFechaCumplea�os(String fechaCumplea�os) {
		this.fechaCumplea�os = fechaCumplea�os;
	}
	public String getDiscapacidad() {
		return discapacidad;
	}
	public void setDiscapacidad(String discapacidad) {
		this.discapacidad = discapacidad;
	}
	public int getRecursos() {
		return recursos;
	}
	public void setRecursos(int recursos) {
		this.recursos = recursos;
	}

	
	public String getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	public int getSalirioPadres() {
		return salirioPadres;
	}
	public void setSalirioPadres(int salirioPadres) {
		this.salirioPadres = salirioPadres;
	}
	
	
	

}
