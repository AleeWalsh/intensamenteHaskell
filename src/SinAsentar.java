
public class SinAsentar implements Estado {
	public void asentarRecuerdo(Recuerdo recuerdo, Ni�a unaNi�a){
		recuerdo.obtenerEmocionDominante().afectarA(recuerdo, unaNi�a);
	}
}
