package kodlam.io.javaSpringBoot.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlam.io.javaSpringBoot.business.abstracts.LanguageService;
import kodlam.io.javaSpringBoot.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {

		this.languageService = languageService;
	}

	@GetMapping("/getAll")
	public List<Language> getAll() {
		return languageService.getAll();
	}
	
	@GetMapping("/add")
	public void add() {
		languageService.add(new Language(6, "HTML"));
		languageService.add(new Language(7, "HTML"));
		languageService.add(new Language(8, "  "));
		languageService.add(new Language(9, ""));
	}
	
	@GetMapping("/update")
	public void update() {
		languageService.update("Python", "piton");
		languageService.update("Python", " ");
		languageService.update("Python", "C#");
	}
	
	@GetMapping("/delete")
	public void delete() {
		languageService.delete("C#");
	}
	
	@GetMapping("/getOne")
	public Language getOne() {
		return languageService.gettOne(1);
	}

}
