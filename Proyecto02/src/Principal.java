
public class Principal {
	public static void main(String[] args) {
		Usuario usu1 = new Usuario();
		usu1.setNombre("Luis");
		usu1.setDni("85883592A");
		
		System.out.println("Usuario 1\n---------");
		System.out.println("Nombre: " + usu1.getNombre());
		System.out.println("DNI: " + usu1.getDni());
		
		System.out.println();
		
		Usuario usu2 = new Usuario("Alberto", "577384729W");
		
		System.out.println("Usuario 2\n---------");
		System.out.println("Nombre: " + usu2.getNombre());
		System.out.println("DNI: " + usu2.getDni());
		
	}
}
