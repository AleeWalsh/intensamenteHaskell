
public class Alegria implements Emocion {
	
	//Punto 2
	
	static Alegria estado = new Alegria();

	public void afectarA(Recuerdo recuerdo , Ni�a unaNi�a){
		if (unaNi�a.obtenerNivelDeFelicidad() > 500){
			unaNi�a.pensamientosCentrales.add(recuerdo);
		}
			
	}
	
	public boolean niega(Recuerdo unRecuerdo) {
		return !estado.equals(unRecuerdo.obtenerEmocionDominante());
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
