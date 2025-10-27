/*
 * package com.example.demo;
 * 
 * import com.example.demo.entities.Compte;
 * import com.example.demo.entities.TypeCompte;
 * import com.example.demo.repository.CompteRepository;
 * import org.springframework.boot.CommandLineRunner;
 * import org.springframework.boot.SpringApplication;
 * import org.springframework.boot.autoconfigure.SpringBootApplication;
 * import org.springframework.context.annotation.Bean;
 * 
 * import java.util.Date;
 * 
 * @SpringBootApplication
 * public class MsBanqueApplication {
 * public static void main(String[] args) {
 * SpringApplication.run(MsBanqueApplication.class, args);
 * }
 * 
 * @Bean
 * CommandLineRunner start(CompteRepository compteRepository) {
 * return args -> {
 * try {
 * compteRepository.save(new Compte(null, Math.random() * 9000, new Date(),
 * TypeCompte.EPARGNE));
 * compteRepository.save(new Compte(null, Math.random() * 9000, new Date(),
 * TypeCompte.COURANT));
 * compteRepository.save(new Compte(null, Math.random() * 9000, new Date(),
 * TypeCompte.EPARGNE));
 * 
 * compteRepository.findAll().forEach(c -> {
 * System.out.println(c.toString());
 * });
 * } catch (Exception e) {
 * System.err.println("Error during save operation: " + e.getMessage());
 * e.printStackTrace();
 * }
 * };
 * }
 * }
 */