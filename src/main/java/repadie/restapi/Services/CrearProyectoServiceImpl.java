package repadie.restapi.Services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repadie.restapi.Models.CrearProyectoModel;
import repadie.restapi.Repositories.CrearProyectoRepository;

@Service
public class CrearProyectoServiceImpl implements CrearProyectoService {

	@Autowired
	CrearProyectoRepository crearProyectoRepository;
	
	
	@Override
	public Map<String, ?> DMLCrearProyecto(CrearProyectoModel pCrearProyecto) {

		return crearProyectoRepository.procDMLCreaProyecto(	
															pCrearProyecto.getCodigo()
															, pCrearProyecto.get_codigomascara()
															, pCrearProyecto.get_nombre()
															, pCrearProyecto.get_libro()
															, pCrearProyecto.get_usuariocrea()
															,pCrearProyecto.get_fechacrea()
															, pCrearProyecto.get_codigo_estado()															, pCrearProyecto.getOpcionDML()
															, pCrearProyecto.getCodlast()
															, pCrearProyecto.get_error_id()
															, pCrearProyecto.get_error_msg()
															);
	}

}
