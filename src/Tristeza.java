
public class Tristeza implements Emocion  {
	
	//Punto 2
	
	public void afectarA(Recuerdo recuerdo , Ni�a unaNi�a){
			try {
				unaNi�a.puedeDisminuirFelicidad();
			} 
			catch (Exception excepcion) {
				// TODO Auto-generated catch block
				System.err.println("El nivel de felicidad queda por debajo del valor 1");
			}
			unaNi�a.pensamientosCentrales.add(recuerdo);
			unaNi�a.establecerNivelDeFelicidad(unaNi�a.obtenerNivelDeFelicidad()*0.9);
		}
	
	public boolean niega(Recuerdo unRecuerdo) {
		return (Alegria.estado).equals(unRecuerdo.obtenerEmocionDominante());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
