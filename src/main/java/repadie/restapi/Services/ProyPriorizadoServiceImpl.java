package repadie.restapi.Services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repadie.restapi.Models.ProyectoPriorizadoModel;
import repadie.restapi.Repositories.ProyPriorizadoRepository;

@Service
public class ProyPriorizadoServiceImpl implements ProyPriorizadoService {

	@Autowired
	ProyPriorizadoRepository proyPriorizadoRepository;
	
	@Override
	public Map<String, ?> DMLCrearProyecto(ProyectoPriorizadoModel pProyPriorizado) {
		return proyPriorizadoRepository.procDMLCreaProyecto( 
		pProyPriorizado.getCodigo()
		, pProyPriorizado.get_codigomascara()
		, pProyPriorizado.get_nombre()
		, pProyPriorizado.get_puntoacta()
		, pProyPriorizado.get_archivo()
		, pProyPriorizado.get_otrosarchivos()
		, pProyPriorizado.get_fechapriorizado()
		, pProyPriorizado.get_numeroacta()
		, pProyPriorizado.get_categoria()
		, pProyPriorizado.get_fechainscripcion()
		, pProyPriorizado.get_usuariocrea()
		, pProyPriorizado.get_fechacrea()
		, pProyPriorizado.get_codigo_proyecto()
		, pProyPriorizado.getOpcionDML()
		, pProyPriorizado.getCodlast()
		, pProyPriorizado.get_error_id()
		, pProyPriorizado.get_error_msg()
		);
	}

}
