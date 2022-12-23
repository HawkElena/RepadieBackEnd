package repadie.restapi.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repadie.restapi.Models.buscarProyPriorizado;
import repadie.restapi.Repositories.BuscarProyPriorizadoRepository;

@Service
public class BuscarProyPriorizadoServiceImpl implements BuscarProyPriorizadoService {

	@Autowired
	BuscarProyPriorizadoRepository buscarProyPriorizadoRepository;

	@Override
	public List<Map<String, ?>> BuscarProyPriorizado(buscarProyPriorizado pBuscaProyPriorizado) {
		List<Map<String,?>> xxx = new ArrayList<>();
		xxx =(buscarProyPriorizadoRepository.sp_busca_proy_priorizado(
				pBuscaProyPriorizado.get_codigo()
				,pBuscaProyPriorizado.get_nombreproy()
				,pBuscaProyPriorizado.get_mascaraproy()
				,pBuscaProyPriorizado.get_mascarapriorizado()
				,pBuscaProyPriorizado.get_codigoestado()
				,pBuscaProyPriorizado.get_puntoacta()	
				,pBuscaProyPriorizado.get_fechainscripcion()
				));
		return  xxx;
	}

}
