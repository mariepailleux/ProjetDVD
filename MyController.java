package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.entities.Client;
import com.project.entities.Dvd;
import com.project.repository.ClientRepository;
import com.project.repository.DvdRepository;

@Controller
public class MyController {

	
	@Autowired
	private DvdRepository dvdRepository;
	@Autowired 
	private ClientRepository clientrepository;
	

	
	
	@RequestMapping(value="/Welcome", method = RequestMethod.GET)
	public String ListDvd(Model model) {
		List<Dvd> listDvd = dvdRepository.findAll();
		model.addAttribute("listDvd", listDvd);
		return "Welcome"; 
	}
	
	@RequestMapping(value="FormulaireEmployeur")
	public String saveEmployeur() {
		return "FormulaireEmployeur"; 
	}
	
	//environnement employés
		@RequestMapping(value="/Vueemploye")
		public String viewList(Model model) {
			
			List<Client> listClient = clientrepository.findAll();
			model.addAttribute("clients", listClient);
			
			List<Dvd> listDvd = dvdRepository.findAll();
			model.addAttribute("dvds", listDvd);
			
			return "Vuemploye";
		}
		
		//Connextion Client
		@RequestMapping(value="Connexionclinet",method=RequestMethod.GET)
		public String connextionClient() {
			return "Compteclient";
		}
		//creer Client
			@RequestMapping(value="Formulaire",method=RequestMethod.GET)
			public String creerClient(Model model) {
				
				model.addAttribute("newclient", new Client());
				
				return "Formulaire"; 
			}
			
			@RequestMapping(value="SaveClient",method=RequestMethod.POST)
			public String saveClient(Client client) {
				
				clientrepository.save(client);
				
				return "Compteclient";
			}
		
		
		//supprimer un client
		@RequestMapping(value = "/Suprimclient")
		public String supprimerClient(Long id) {
			
			clientrepository.delete(id);
			
			return "redirect:Vueemploye";
		}
		
		//creer Dvd
		@RequestMapping(value="Formulairedvd",method=RequestMethod.GET)
		public String creerDvd(Model model) {
			
			model.addAttribute("newdvd", new Dvd());
			
			return "Formulairedvd";
		}
		@RequestMapping(value="SaveDvd",method=RequestMethod.POST)
		public String saveDvd(Dvd dvd) {
			
			dvdRepository.save(dvd);
			
			return "redirect:/Vueemploye";
			
		}
		
		//supprimer un Dvd
			@RequestMapping(value = "/Suprimdvd")
			public String supprimerDvd(Long id) {
				
				dvdRepository.delete(id);
				
				return "redirect:Vueemploye";
			}
			
		//Edit Dvd
			@RequestMapping(value="Editdvd",method=RequestMethod.GET)
			public String editDvd(Long id,Model model) {
				
				Dvd dvd = dvdRepository.getOne(id);
				
				model.addAttribute("newdvd", dvd);
				
				return "Formulairedvd";
			}

	
}






















