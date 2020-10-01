package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.model.Tarefa;
import mvc.model.TarefasDAO;

@Controller
public class TarefaController {
	
	@RequestMapping("/")
	public String execute() {
		System.out.println("Lógica do MVC");
		return "info";
	}
	
	@RequestMapping("criaTarefa")
	public String form() {
		return "formTarefa";
	}
	
	@RequestMapping("adicionaTarefa")
	public String adiciona(Tarefa tarefa) {
		TarefasDAO dao = new TarefasDAO();
		dao.adicionaTarefa(tarefa);
		return "adicionada";
	}
	
	@RequestMapping("listaTarefas")
	public String listar(Model model) {
		TarefasDAO dao = new TarefasDAO();
		model.addAttribute("tarefas", dao.getLista());
		return "listaTarefas";
	}
	
	@RequestMapping("tarefaRemovida")
	public String removida() {
		return "tarefaRemovida";
	}
	
	@RequestMapping(value = "removeTarefa/{id}", method = RequestMethod.GET)
	public String remove(@PathVariable Long id) {
		TarefasDAO dao = new TarefasDAO();
		dao.remove(id);
		return "redirect:/tarefaRemovida";
	}

}
