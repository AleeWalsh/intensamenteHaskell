
public class Profundizacion implements ProcesoMental {

	public void afectarA(Ni�a unaNi�a, String palabraClave) {
		for(int i = 0; i < unaNi�a.recuerdos.size(); i++) {
			if(unaNi�a.pensamientosCentrales.contains(unaNi�a.recuerdos.get(i)) && !unaNi�a.obtenerEmocionDominante().niega(unaNi�a.recuerdos.get(i))) {
				unaNi�a.memoriaALargoPlazo.add(unaNi�a.recuerdos.get(i));
			}
		}
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

	
}
