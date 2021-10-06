package examen_recuperacion_sando;

import java.util.Scanner;





public class MainSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Scanner lector = new Scanner(System.in);
		String usuario = "ADMIN";
		String clave = "ABC";
		String codigoBeca;
		String nombre;
		String apellido;
		int i = 0;
		boolean resultado = false;
		boolean resultado1 = false;
		Estudiantes lsitaEstudiantes[] = new Estudiantes[5];
		Estudiantes nuevoEstudiantes1 = new Estudiantes();
		Estudiantes nuevoEstudiantes2 = new Estudiantes();
		Estudiantes nuevoEstudiantes3 = new Estudiantes();
		Estudiantes nuevoEstudiantes4 = new Estudiantes();
		Estudiantes nuevoEstudiantes5 = new Estudiantes();
		
		lsitaEstudiantes[0] = nuevoEstudiantes1;
		lsitaEstudiantes[1] = nuevoEstudiantes2;
		lsitaEstudiantes[2] = nuevoEstudiantes3;
		lsitaEstudiantes[3] = nuevoEstudiantes4;
		lsitaEstudiantes[4] = nuevoEstudiantes5;
		
		
		
		
		
		
		
		
		int salir;
		do {

			System.out.println("Ingrese usuario del sistema: ");
			String usuarioComparar = teclado.nextLine();
			System.out.println("Ingrese clave del sistema: ");
			String claveComparar = teclado.nextLine();

			resultado = usuarioComparar.equals(usuario);

			resultado1 = claveComparar.equals(clave);
			if (resultado == false) {
				System.out.println("Usuario incorrecto");
			} else {
				System.out.println("Usuario Correcto");
			}
			if (resultado1 == false) {
				System.out.println("Usuario incorrecto");
			} else {
				System.out.println("Usuario Correcto");
			}

		} while (resultado != true && resultado1 != true);

		do {

			System.out.println("Sistema SENESCYT\r\n" + "1. Ingresar becado\r\n" + "2. Búsqueda por tipo de becado\r\n"
					+ "3. Búsqueda general\r\n" + "4. SALIR");
			salir = lector.nextInt();

			switch (salir) {

			case 1:

				System.out.println(" Escoja el tipo de becado que desea ingresar");

				System.out.println("1.- Becado por notas\n"
						+ "2.- Becado por Discapacidad\n"
						+ "3.- Becado por Recursos");
				int opcion2 = lector.nextInt();
				Estudiantes nuevoEstuadinte = new Estudiantes();
				if (opcion2 == 1) {
					
					System.out.println("Ingrese Codigo de beca");
					codigoBeca = teclado.nextLine(); 
					System.out.println("Ingrese nombre");
					nombre = teclado.nextLine(); 
					System.out.println("Ingrese apellido");
					apellido = teclado.nextLine(); 
					System.out.println("Ingrese codigo colegio");
					String codigoColegio = teclado.nextLine(); 
					System.out.println("Ingrese fecha de cumpleaños");
					String fechaCumpleanos = lector.nextLine(); 
					nuevoEstuadinte.setCodigoBeca(codigoBeca);
					nuevoEstuadinte.setNombre(nombre);
					nuevoEstuadinte.setApellido(apellido);
					nuevoEstuadinte.setColegio(codigoColegio);
					nuevoEstuadinte.setFechaCumpleanos(fechaCumpleanos);
				}else if(opcion2 == 2) {
					System.out.println("Ingrese Codigo de beca");
					codigoBeca = teclado.nextLine(); 
					System.out.println("Ingrese nombre");
					nombre = teclado.nextLine(); 
					System.out.println("Ingrese apellido");
					apellido = teclado.nextLine();
					System.out.println("Ingrese codigo conadis");
					String codigoConadis = teclado.nextLine(); 
					System.out.println("Ingrese discapacidad");
					String discapacidad = teclado.nextLine();
					nuevoEstuadinte.setCodigoBeca(codigoBeca);
					nuevoEstuadinte.setNombre(nombre);
					nuevoEstuadinte.setApellido(apellido);
					nuevoEstuadinte.setCodigoConadis(codigoConadis);
					nuevoEstuadinte.setDiscapacidad(discapacidad);
				}else if(opcion2 == 3) {
					System.out.println("Ingrese Codigo de beca");
					codigoBeca = teclado.nextLine(); 
					System.out.println("Ingrese nombre");
					nombre = teclado.nextLine(); 
					System.out.println("Ingrese apellido");
					apellido = teclado.nextLine(); 
					System.out.println("Ingrese codigo beneficio");
					String codigoBenficio = teclado.nextLine(); 
					System.out.println("Ingrese salario de los Padres");
					int salarioPadres = lector.nextInt(); 
					nuevoEstuadinte.setCodigoBeca(codigoBeca);
					nuevoEstuadinte.setNombre(nombre);
					nuevoEstuadinte.setApellido(apellido);
					nuevoEstuadinte.setBeneficios(codigoBenficio);
					nuevoEstuadinte.setSalirioPadres(salarioPadres);
					
				}else {
					System.out.println("No existe esa Opcion");
				}
				
				
				
				
				
				lsitaEstudiantes[i] = nuevoEstuadinte;
				
				i++;
				
				
				
				break;

			case 2:
				break;

			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("No existe esa opcion");
				break;

			}

		} while (salir != 4);

	}

}
