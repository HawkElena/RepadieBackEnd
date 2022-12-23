package repadie.restapi.Services;

import java.util.List;
import java.util.Map;

import repadie.restapi.Models.buscarProyPriorizado;

public interface BuscarProyPriorizadoService {
	public List<Map<String, ?>> BuscarProyPriorizado(buscarProyPriorizado pBuscaProyPriorizado);
}
