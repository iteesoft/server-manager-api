package com.iteesoft.server;

import com.iteesoft.server.enums.Status;
import com.iteesoft.server.model.Server;
import com.iteesoft.server.repository.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.iteesoft.server.enums.Status.*;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

//	@Bean
//	CommandLineRunner run(ServerRepo serverRepo) {
//		return args -> {
//			serverRepo.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16 GB", "Personal PC", "http://localhost:8080/server/image/server2.png", SERVER_UP));
//			serverRepo.save(new Server(null, "192.168.1.50", "Fedora Linux", "16 GB", "Dell Tower", "http://localhost:8080/server/image/server.png", SERVER_UP));
//			serverRepo.save(new Server(null, "192.168.1.21", "MS 2008", "32 GB", "Web Server", "http://localhost:8080/server/image/server-3.png", SERVER_UP));
//			serverRepo.save(new Server(null, "192.168.1.14", "Red Hat Enterprise Linux", "64 GB", "Mail Server", "http://localhost:8080/server/image/server-main.png", SERVER_UP));
//		};
//	}
}
