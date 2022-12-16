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

import repadie.restapi.Models.CrearProyectoModel;
import repadie.restapi.Services.CrearProyectoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/Proyecto")
public class ProyectoController {

	@Autowired
	CrearProyectoService entityService;
	
	@PostMapping("/crear")
	@Transactional
	List<Map<String, ?>> getProyectos(@RequestBody CrearProyectoModel pEntity){
		List<Map<String, ?>> lstEntityRet = new ArrayList<Map<String,?>>();
		
		if(pEntity.getOpcionDML()== 1 || pEntity.getOpcionDML() == 3 ) {
			
//			entityInterno = entityService.DMLCrearProyecto(pEntity);
			
//			entityInterno = entityService.save(pEntity);
//			entityInterno.set_message("the register was inserted successfully...");			
//			entityInterno.set_opcionDML(pEntity.get_opcionDML());
//			lstEntityRet.add(entityInterno);
			
			lstEntityRet.add(entityService.DMLCrearProyecto(pEntity));
			
			
			System.out.println("hawk back the regret is good!!! test " + lstEntityRet.get(0).get("codlast"));
			
			
		}else if (pEntity.getOpcionDML()== 2){
//			lstEntityRet.add(pEntity);
			
//			CompositeKeyFirst pk1 = new CompositeKeyFirst();
//			pk1.setMuni_id(pEntity.getMuni_id());
//			pk1.setId(pEntity.getId());
//			
//			entityInterno.setMuni_id(pk1.getMuni_id());
//			entityInterno.setId(pk1.getId());
//			
//			if(entityService.deleteById(pk1)) {
//				entityInterno.set_message("the register was deleted successfully..." + pk1);
//				entityInterno.set_opcionDML(pEntity.get_opcionDML());
//			}else {
//				entityInterno.set_message("something was wrong chek all parameters..." + pk1);
//				entityInterno.set_opcionDML(pEntity.get_opcionDML());
//			}
//			
//			lstEntityRet.add(entityInterno);
		}else if(pEntity.getOpcionDML() == 4) {
//			lstEntityRet.add(pEntity);
			
//			List<Cat1Clasification> lstEntityB =  entityService.buscarxnombre(
//					pEntity.getName()
//					,pEntity.getMuni_id()
//					);
//
//			lstEntityRet= lstEntityB;
		};
			
		
		//lstGroupArea.add(groupA);
		return lstEntityRet;
	}
	
	
}