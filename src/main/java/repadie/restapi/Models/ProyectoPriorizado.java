package repadie.restapi.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity

public class ProyectoPriorizado {

//	INICIO DE DATOS DE LA CREACION DEL PROYECTO
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
	
//	FIN DE DATOS DE LA CRECION DEL PROYECTO
	
//	DATOS DEL PROYECTO PRIORIZADO
	@Column(name = "_codigopriorizado")
	private Integer _codigopriorizado    ;
	
	@Column(name = "_codigomascarapri")
	private String 	_codigomascarapri    ;
	
	@Column(name = "_nombrepri")
	private String 	_nombrepri           ;
	
	@Column(name = "_puntoacta")
	private String 	_puntoacta           ;
	
	@Column(name = "_archivo")
	private String	_archivo             ;
	
	@Column(name = "_otrosarchivos")
	private String 	_otrosarchivos       ;
	
	@Column(name = "_fechapriorizado")
	private Date 	_fechapriorizado     ;
	
	@Column(name = "_numacta")
	private Integer	_numacta             ; 
	
	@Column(name = "_categoria")
	private Integer	_categoria           ;
	
	@Column(name = "_fechainscripcion")
	private Date	_fechainscripcion    ;
	
	@Column(name = "_usuariocreapri")
	private Integer	_usuariocreapri      ;
	
	@Column(name = "_fechacreapri")
	private Date	_fechacreapri        ;
	
//	FIN DE DATOS DEL PROYECTO PRIORIZADO
	
//	PARAMETROS PARA CONTROLAR LOS DATOS DE REGRESO
	@Transient
	@Column(name = "opcionDML")
	private Integer opcionDML ;
	
	@Transient
	@Column(name = "codlast")
	private String codlast ;
	
	@Transient
	@Column(name = "codlastpri")
	private String codlastpri ;

	@Transient
	@Column(name = "_error_id")
	private Integer _error_id ;

	@Transient
	@Column(name = "_error_msg")
	private String _error_msg ;
//	FIN DE PARAMETROS PARA CONTROLAR LOS DATOS DE REGRESO

}
