package com.sangjea.app;

import com.sangjea.app.entity.*;
import com.sangjea.app.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	private final PersonRepository personRepository;
	private final SocialMediaRepository socialMediaRepository;
	private final InterestsRepository interestsRepository;
	private final SkillRepository skillRepository;
	private final WorkRepository workRepository;

	public AppApplication(PersonRepository personRepository, SocialMediaRepository socialMediaRepository, InterestsRepository interestsRepository, SkillRepository skillRepository, WorkRepository workRepository) {
		this.personRepository = personRepository;
		this.socialMediaRepository = socialMediaRepository;
		this.interestsRepository = interestsRepository;
		this.skillRepository = skillRepository;
		this.workRepository =workRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("조상제", "모바일", "hello@test.com", "010-1234-5678"));
		socialMediaRepository.save(new SocialMedia("anonymous", "anonymous"));
		interestsRepository.save(new Interests("League of Legend"));
		interestsRepository.save(new Interests("Battle Ground"));
		interestsRepository.save(new Interests("Soccer"));
		skillRepository.save(new Skill("JAVA", 100));
		skillRepository.save(new Skill("C", 80));
		skillRepository.save(new Skill("Kotlin", 60));
		workRepository.save(new Work("제목", "과제", "11:11", "공부하자공부하자공부하자"));
		workRepository.save(new Work("제목", "과제", "11:11", "공부하자공부하자공부하자"));
	}
}
