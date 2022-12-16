package repadie.restapi.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
//@Table(name = "tbl_proyecto")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "db_repaide.sp_creacionproyecto", procedureName = "sp_creacionproyecto", parameters = {
			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "codigo", 				type = Long.class),
			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "_codigomascara", 		type = String.class),
			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "_nombre", 				type = String.class),
			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "_usuariocrea", 			type = Integer.class),
			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "_fechacrea", 			type = Date.class),
			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "_codigo_estado", 		type = Integer.class),
			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "opcionDML", 				type = Integer.class),
			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "codlast", 				type = String.class),
			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "_error_id", 				type = Integer.class),
			@StoredProcedureParameter(mode =  ParameterMode.INOUT, name = "_error_msg", 			type = String.class)
			})

})
public class CrearProyectoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Long codigo ;
	
	@Column(name = "codigomascara")
	private String _codigomascara ;
	
	@Column(name = "nombre")
	private String _nombre ;
	
	@Column(name = "usuariocrea")
	private Integer _usuariocrea ;
	
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	@Column(name = "fechacrea")
	private Date _fechacrea ;
	
	@Column(name = "codigo_estado")
	private Integer _codigo_estado ;
	
	@Transient
	@Column(name = "opcionDML")
	private Integer opcionDML ;
	
	@Transient
	@Column(name = "codlast")
	private String codlast ;
	
	
	@Transient
	@Column(name = "_error_id")
	private Integer _error_id ;

	@Transient
	@Column(name = "_error_msg")
	private String _error_msg ;
}
