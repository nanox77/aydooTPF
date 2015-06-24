package dominio;

import org.junit.Assert;
import org.junit.Test;

import utilidades.RecorridoDTO;

public class RecorridoTest {

	@Test
	public void parsearARecorridoDTODebeDevolverObjetoConExtremosRecorrido (){
		
		Estacion estacion1 = new Estacion (1, "Retiro");
		Estacion estacion2 = new Estacion (2, "Urquiza");
		Recorrido recorrido = new Recorrido (estacion1, estacion2);
		
		RecorridoDTO recorridoDTO = new RecorridoDTO (estacion1.getId(), estacion2.getId());
		
		Assert.assertEquals(recorridoDTO, Recorrido.parsearADTO(recorrido));
	}
	
}
