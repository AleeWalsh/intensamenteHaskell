
public class Asentamiento implements ProcesoMental {
	public void afectarA(Ni�a unaNi�a, String palabraClave) {
		for(int i = 0; i < unaNi�a.recuerdos.size(); i++ ) {
			unaNi�a.recuerdos.get(i).obtenerEmocionDominante().afectarA(unaNi�a.recuerdos.get(i), unaNi�a);
		}
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
