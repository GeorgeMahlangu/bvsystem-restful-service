package za.ac.tut.bvsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import za.ac.tut.bvsystem.domain.AddressEntity;
import za.ac.tut.bvsystem.domain.HomeOwnerEntity;
import za.ac.tut.bvsystem.persistance.HomeOwnerRepository;

@SpringBootApplication
public class BvsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BvsystemApplication.class, args);
	}
        
        @Bean
        public CommandLineRunner run(HomeOwnerRepository homeOwnerRepository) throws Exception {
            return (String[] args) -> {
                homeOwnerRepository.save(new HomeOwnerEntity("George", "Mahlangu", "942","0823207253",
                  new AddressEntity("Isidanga Street", "Block F", "Soshanguve", "0152","Residential"),"Black"));

            homeOwnerRepository.save(new HomeOwnerEntity("Erick", "Mahlangu", "943","0823207253",
                    new AddressEntity("Isidanga Street", "Block F", "Soshanguve", "0152","Residential"),"Black"));

            homeOwnerRepository.save(new HomeOwnerEntity("Mike", "Masemola", "945","0823207253",
                    new AddressEntity("Isidanga Street", "Block F", "Soshanguve", "0152","Residential"),"Black"));

            homeOwnerRepository.save(new HomeOwnerEntity("Martin", "Smith", "941","0823207253",
                    new AddressEntity("Isidanga Street", "Block F", "Soshanguve", "0152","Residential"),"White"));

            homeOwnerRepository.save(new HomeOwnerEntity("Sipho", "Mahlangu", "938","0823207253",
                    new AddressEntity("Isidanga Street", "Block F", "Soshanguve", "0152","Residential"),"Black"));

            homeOwnerRepository.save(new HomeOwnerEntity("Sammy", "Mahlangu", "955","0823207253",
                    new AddressEntity("Isidanga Street", "Block F", "Soshanguve", "0152","Residential"),"Black"));
            
            };
        }

}
