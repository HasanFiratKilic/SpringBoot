package kodlam.io.javaSpringBoot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlam.io.javaSpringBoot.business.abstracts.LanguageService;
import kodlam.io.javaSpringBoot.dataAccess.abstracts.LanguageRepository;
import kodlam.io.javaSpringBoot.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	LanguageRepository languageRepository;

	public LanguageManager() {

	}

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {

		return languageRepository.getAll();
	}

	@Override
	public Language gettOne(int id) {

		return languageRepository.gettOne(id);
	}

	@Override
	public void delete(String dName) {
		languageRepository.delete(dName);

	}

	@Override
	public void update(String name, String uName) {
		boolean isExist = false;
		if (!uName.replace(" ", "").isEmpty()) {
			for (Language element : languageRepository.getAll()) {
				if (element.getName().equals(uName)) {
					isExist = true;
				}
			}
			if (!isExist) {
				languageRepository.update(name, uName);
			}
		}
		
	}

	@Override
	public void add(Language language) {
		boolean isExist = false;
		if (!language.getName().replace(" ", "").isEmpty()) {
			for (Language element : languageRepository.getAll()) {
				if (element.getName().equals(language.getName())) {
					isExist = true;
				}
			}
			if (!isExist) {
				languageRepository.add(language);
			}
		}

	}

}
