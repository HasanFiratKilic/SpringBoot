package kodlam.io.javaSpringBoot.business.abstracts;

import java.util.List;

import kodlam.io.javaSpringBoot.entities.concretes.Language;

public interface LanguageService {
	
	List<Language> getAll();
	
	void delete(String dName);
	
	void update(String name,String uName);
	
	void add(Language language);
	
	Language gettOne(int id);

}
