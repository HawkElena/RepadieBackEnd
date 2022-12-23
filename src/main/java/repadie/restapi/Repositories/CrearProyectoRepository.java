package repadie.restapi.Repositories;

import java.util.Date;
import java.util.Map;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import repadie.restapi.Models.CrearProyectoModel;

@Repository
public interface CrearProyectoRepository extends JpaRepository<CrearProyectoModel, Long> {
//	para realizar las operaciones de insert delete y update 
	@Procedure(name = "sp_creacionproyecto")
	Map<String, ?> procDMLCreaProyecto(
										Long 		codigo
										, String 	_codigomascara
										, String 	_nombre
										, Integer	_libro
										, Integer 	_usuariocrea
										, Date		_fechacrea
										, Integer 	_codigo_estado
										, Integer 	opcionDML
										, String 	codlast
										, Integer 	_error_id
										,String 	_error_msg
										);
	

}
