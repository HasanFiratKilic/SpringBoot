package kodlam.io.javaSpringBoot.dataAccess.abstracts;

import java.util.List;

import kodlam.io.javaSpringBoot.entities.concretes.Language;

public interface LanguageRepository {
	
	List<Language> getAll();
	
	void delete(String dName);
	
	void update(String name,String uName);
	
	void add(Language language);
	
	Language gettOne(int id);


}
