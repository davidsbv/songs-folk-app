package com.davidsbv.folk_songs_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FolkSongsAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(FolkSongsAppApplication.class, args);
		System.out.println("Running");
	}

}
