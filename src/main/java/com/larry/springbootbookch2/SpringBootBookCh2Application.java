package com.larry.springbootbookch2;

import com.larry.springbootbookch2.domain.Journal;
import com.larry.springbootbookch2.domain.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootBookCh2Application {

	@Bean
	InitializingBean saveData(JournalRepository journalRepository) {
		return () -> {
			journalRepository.save(new Journal("스프링 부트 입문", "오늘부터 스프링 부트 공부하기 시작했다", "01/01/2016"));
			journalRepository.save(new Journal("간단한 스프링 부트 프로젝트", "스프링 부트 프로젝트를 처음 만들어보았다", "01/02/2016"));
			journalRepository.save(new Journal("스프링 부트 해부", "스프링 부트를 자세히 살펴보았다.", "02/01/2016"));
			journalRepository.save(new Journal("스프링 부트 클라우드", "클라우드 파운드리를 응용한 스프링 부트를 공부했다", "03/01/2016"));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookCh2Application.class, args);
	}
}
