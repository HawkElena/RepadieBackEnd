package repadie.restapi.Repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import repadie.restapi.Models.buscarProyPriorizado;

@Repository
public interface BuscarProyPriorizadoRepository extends JpaRepository<buscarProyPriorizado, Long> {
	@Query(value = "{call sp_busca_proy_priorizado (:_codigo,"
			+ ":_nombreproy,"
			+ ":_mascaraproy,"
			+ ":_mascarapriorizado,"
			+ ":_codigoestado,"
			+ ":_puntoacta,"
			+ ":_fechainscripcion)}", nativeQuery = true)
	List<Map<String, ?>>  sp_busca_proy_priorizado(
			@Param("_codigo")				Long 	_codigo
			,@Param("_nombreproy")			String 	_nombreproy
			,@Param("_mascaraproy")			String	_mascaraproy
			,@Param("_mascarapriorizado")	String 	_mascarapriorizado
			,@Param("_codigoestado")		Long 	_codigoestado
			,@Param("_puntoacta")			String 	_puntoacta
			,@Param("_fechainscripcion")	String 	_fechainscripcion
			);
	

//	
//	@Query(value ="{call sp_mun_getEvaluateMatrix  (:_muni_id,"
//													+ ":_event_ids,"
//													+ ":_prob_id,"
//													+ ":_sever_id,"
//													+ ":_event_desc,"
//													+ ":_area_name,"
//													+ ":_group_name,"
//													+ ":_prob_puntaje,"
//													+ ":_sever_puntaje)}", nativeQuery = true)
//    List<Map<String, ?>> procListarEvaluateMatrix( 
//													@Param("_muni_id")				long	_muni_id
//													,@Param("_event_ids")			long	_event_ids
//													,@Param("_prob_id")				long	_prob_id
//													,@Param("_sever_id")			long	_sever_id
//													,@Param("_event_desc")			String	_event_desc
//													,@Param("_area_name")			String	_area_name
//													,@Param("_group_name")			String	_group_name
//													,@Param("_prob_puntaje")		int		_prob_puntaje
//													,@Param("_sever_puntaje")		int		_sever_puntaje													
//													);
//	
	
//	@Procedure(name = "sp_busca_proy_priorizado")
//	List<Map<String, ?>> sp_busca_proy_priorizado(
//			Long 		_codigo
//			, String 	_nombreproy
//			, String 	_mascaraproy
//			, String	_mascarapriorizado
//			, Long		_codigoestado
//			, String	_puntoacta
//			, String    _fechainscripcion
//			);
//	
	
}
