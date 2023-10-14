package kodlam.io.javaSpringBoot.dataAccess.concretes;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlam.io.javaSpringBoot.dataAccess.abstracts.LanguageRepository;
import kodlam.io.javaSpringBoot.entities.concretes.Language;
@Repository
public class InMemoryLanguageRepository  implements LanguageRepository{
	
	List<Language> languages;
	
	

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"Python"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"JavaScript"));
		languages.add(new Language(4,"C#"));
		languages.add(new Language(5,"Ruby"));
		
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public void delete(String dName) {
		int index = 0;
		for (Language language : languages) {
			if(language.getName().equals(dName)) {
				index = languages.indexOf(language);
			}
		}
		languages.remove(index);
		
		
		
	}

	@Override
	public void update(String name,String uName) {
		
		for (Language language : languages) {
			if(language.getName().equals(name)) {
				language.setName(uName);
			}
		}
		
	}

	@Override
	public Language gettOne(int id) {
		for (Language language : languages) {
			if(language.getId() == id) {
				return language;
			}
		}
		return null;
	}

	@Override
	public void add(Language language) {
		languages.add(language);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
