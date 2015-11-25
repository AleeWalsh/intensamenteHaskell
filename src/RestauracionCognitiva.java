
public class RestauracionCognitiva implements ProcesoMental {
	
	public void afectarA(Ni�a unaNi�a, String palabraClave) {
		try {
			unaNi�a.puedeAumentarFelicidad();
		} 
		catch (Exception excepcion) {
			System.err.println("El nivel de felicidad no puede ser mayor a 1000");
		}
		unaNi�a.establecerNivelDeFelicidad(unaNi�a.obtenerNivelDeFelicidad() + 100);
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}
	
}
