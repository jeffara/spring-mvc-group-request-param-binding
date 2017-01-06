package com.jeff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeff.model.Person;

@RestController
public class ParamGroupController {
	
	@GetMapping(path="/group")
	/* Exemplo de chamada com o bind de parâmetros da request automaticamente
	 * nos atributos de um objeto do tipo Person.
	 * 
	 * Ressalvas: 
	 *    - O Spring MVC utiliza os métodos getters e setters para realização do bind.
	 *    - O Spring MVC utiliza o construtor de classe padrão para instanciar o objeto antes do bind.
	 * 
	 * Necessito usar @ResponseBody quando a classe estiver anotada como @Controller
	 * Caso a classe esteja anotada como @RestController, é necessário apenas retornar o modelo, pois o Spring
	 * Já entenderá que estamos trabalhando com @ResponseBody
	 * Por default Spring retorna o modelo em formato JSON, porém se a classe modelo for anotada como @XmlRootElement
	 * É possível realizar a chamada e obter o modelo nos dois formatos, por default virá XML, porém na chamada, com ".formato"
	 * É possível obter o retorno no formato informado, exemplo: http://localhost:8080/team.json ou http://localhost:8080/team.xml
	 * Nos clientes REST, é possível também no Header da chamada HTTP, informar o formato através do atributo "Accept: application/json(xml)"
	 * 
	 */ 
	public Person getPerson(Person person) {
		return person;
	}
}