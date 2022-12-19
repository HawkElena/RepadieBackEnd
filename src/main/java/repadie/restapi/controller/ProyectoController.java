package repadie.restapi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jayway.jsonpath.ParseContext;

import repadie.restapi.Models.CrearProyectoModel;
import repadie.restapi.Models.ProyectoPriorizadoModel;
import repadie.restapi.Services.CrearProyectoService;
import repadie.restapi.Services.ProyPriorizadoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/Proyecto")
public class ProyectoController {

	@Autowired
//	CrearProyectoService entityService;
	ProyPriorizadoService entityService;
	
	@Autowired
	CrearProyectoService  entityPryService;
	
//	@PostMapping("/crear")
//	@Transactional
//	List<Map<String, ?>> getProyectos(@RequestBody CrearProyectoModel pEntity){
//		List<Map<String, ?>> lstEntityRet = new ArrayList<Map<String,?>>();
//		
//		if(pEntity.getOpcionDML()== 1 || pEntity.getOpcionDML() == 3 ) {
//			
////			entityInterno = entityService.DMLCrearProyecto(pEntity);
//			
////			entityInterno = entityService.save(pEntity);
////			entityInterno.set_message("the register was inserted successfully...");			
////			entityInterno.set_opcionDML(pEntity.get_opcionDML());
////			lstEntityRet.add(entityInterno);
//			
////			lstEntityRet.add(entityService.DMLCrearProyecto(pEntity));
//			
//			
//			System.out.println("hawk back the regret is good!!! test " + lstEntityRet.get(0).get("codlast"));
//			
//			
//		}else if (pEntity.getOpcionDML()== 2){
////			lstEntityRet.add(pEntity);
//			
////			CompositeKeyFirst pk1 = new CompositeKeyFirst();
////			pk1.setMuni_id(pEntity.getMuni_id());
////			pk1.setId(pEntity.getId());
////			
////			entityInterno.setMuni_id(pk1.getMuni_id());
////			entityInterno.setId(pk1.getId());
////			
////			if(entityService.deleteById(pk1)) {
////				entityInterno.set_message("the register was deleted successfully..." + pk1);
////				entityInterno.set_opcionDML(pEntity.get_opcionDML());
////			}else {
////				entityInterno.set_message("something was wrong chek all parameters..." + pk1);
////				entityInterno.set_opcionDML(pEntity.get_opcionDML());
////			}
////			
////			lstEntityRet.add(entityInterno);
//		}else if(pEntity.getOpcionDML() == 4) {
////			lstEntityRet.add(pEntity);
//			
////			List<Cat1Clasification> lstEntityB =  entityService.buscarxnombre(
////					pEntity.getName()
////					,pEntity.getMuni_id()
////					);
////
////			lstEntityRet= lstEntityB;
//		};
//			
//		
//		//lstGroupArea.add(groupA);
//		return lstEntityRet;
//	}
//	
	@PostMapping("/Priorizado")
	@Transactional
	List<Map<String, ?>> getProyectos(@RequestBody ProyectoPriorizadoModel pEntity){
		List<Map<String, ?>> lstEntityRet = new ArrayList<Map<String,?>>();
		List<Map<String, ?>> lstEntityRet2 = new ArrayList<Map<String,?>>();
		
		CrearProyectoModel pEntity2 = new CrearProyectoModel();
		
		if(pEntity.getOpcionDML()== 1 || pEntity.getOpcionDML() == 3 ) {
			
			//configura los valores del proyecto para su creacion
			pEntity2.setCodigo((long) 1);
			pEntity2.set_codigomascara(pEntity.get_codigomascara());
			pEntity2.set_nombre(pEntity.get_nombre());
			pEntity2.set_usuariocrea(pEntity.get_usuariocrea());
			pEntity2.set_fechacrea(pEntity.get_fechacrea());
			pEntity2.set_codigo_estado(1);
			pEntity2.setOpcionDML(pEntity.getOpcionDML());
			pEntity2.setCodlast(pEntity.getCodlast());
			pEntity2.set_error_id(pEntity.get_error_id());
			pEntity2.set_error_msg(pEntity.get_error_msg());
		
			//hace el insert a la tabla proyectos
			lstEntityRet2.add(entityPryService.DMLCrearProyecto(pEntity2));
			if((int)lstEntityRet2.get(0).get("_error_id") == -42) {
				System.out.println("Codigo del proyecto = " + lstEntityRet2.get(0).get("codlast").toString());
				
				Integer intValorProyFK = Integer.parseInt(lstEntityRet2.get(0).get("codlast").toString());
				
				pEntity.set_codigo_proyecto(intValorProyFK);
				lstEntityRet.add(entityService.DMLCrearProyecto(pEntity));	
				
			}else {
				System.out.println("Hubo un error al crear el proyecto " + lstEntityRet2.get(0).get("_error_msg"));
				lstEntityRet.add(lstEntityRet2.get(0));
			}
			
			
			
			
			System.out.println("hawk back the regret is good!!! test " + lstEntityRet.get(0).get("codlast"));
			
			
		}else if (pEntity.getOpcionDML()== 2){
		}else if(pEntity.getOpcionDML() == 4) {
		};
			
		
		return lstEntityRet;
	}
	
	
}