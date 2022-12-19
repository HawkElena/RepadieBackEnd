package repadie.restapi.Repositories;


import java.util.Date;
import java.util.Map;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import repadie.restapi.Models.ProyectoPriorizadoModel;

@Repository
public interface ProyPriorizadoRepository extends JpaRepository<ProyectoPriorizadoModel, Long> {

//	para realizar las operaciones de insert delete y update 
	@Procedure(name = "db_repaide.SP_PRIORIZADO_BUENO")
	Map<String, ?> procDMLCreaProyecto(
										Long 		codigo
										, String 	_codigomascara
										, String 	_nombre
										, String	_puntoacta
										, byte[]	_archivo
										, String	_otrosarchivos
										, Date		_fechapriorizado
										, String    _numeroacta
										, Integer	_categoria
										, Date		_fechainscripcion
										, Integer 	_usuariocrea
										, Date		_fechacrea
										, Integer	_codigo_proyecto
										, Integer 	opcionDML
										, String 	codlast
										, Integer 	_error_id
										,String 	_error_msg
										);
}
