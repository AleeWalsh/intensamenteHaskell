
public class ControlHormonal implements ProcesoMental {
	
	//Punto 7
	
	public void afectarA(Ni�a unaNi�a, String palabraClave) {
		for(int i = 0; i < unaNi�a.pensamientosCentrales.size(); i++) {
			if(unaNi�a.memoriaALargoPlazo.contains(unaNi�a.pensamientosCentrales.get(i)) || this.todosLosRecuerdosDelDiaMismaEmocionDominante(unaNi�a)) {
				this.desequilibrioHormonal();				
			}
		}
	}
	
	public boolean todosLosRecuerdosDelDiaMismaEmocionDominante(Ni�a unaNi�a) {
		boolean mismaEmocionEnTodosLosRecuerdos = true;
		int i= 0;
		int j= 0;
		while(mismaEmocionEnTodosLosRecuerdos && j <= unaNi�a.recuerdos.size()) {
		
				if (unaNi�a.recuerdos.get(j).obtenerEmocionDominante() != unaNi�a.recuerdos.get(i).obtenerEmocionDominante()) {
					mismaEmocionEnTodosLosRecuerdos = false;
			}
				j++;
		}
		return mismaEmocionEnTodosLosRecuerdos;
	}
	
	public void desequilibrioHormonal() {
		
	}

}
