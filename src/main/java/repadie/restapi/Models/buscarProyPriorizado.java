package repadie.restapi.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
//@Table(name = "tbl_proyecto")
//@NamedStoredProcedureQueries({
//	@NamedStoredProcedureQuery(name = "sp_busca_proy_priorizado", procedureName = "sp_busca_proy_priorizado", parameters = {
//			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "_codigo", 			type = Long.class),
//			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "_nombreproy", 		type = String.class),
//			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "_mascaraproy", 		type = String.class),
//			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "_mascarapriorizado", type = String.class),
//			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "_codigoestado", 		type = Long.class),
//			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "_puntoacta", 		type = String.class),
//			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "_fechainscripcion", 	type = String.class),
//			})
//
//})
public class buscarProyPriorizado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "_codigo")
	public Long 	_codigo             ;
	
	@Column(name = "_nombreproy")
	public String 	_nombreproy			;  
	
	@Column(name = "_mascaraproy")
	public String	_mascaraproy		;
	
	@Column(name = "_mascarapriorizado")
	public String	_mascarapriorizado	;
	
	@Column(name = "_codigoestado")
	public Long		_codigoestado		;
	
	@Column(name = "_puntoacta")
	public String	_puntoacta			;
    
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "_fechainscripcion")
	public String	_fechainscripcion	;
   
	
	
}
