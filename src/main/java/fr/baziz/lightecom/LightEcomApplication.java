package fr.baziz.lightecom;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.baziz.lightecom.dao.CategoryRepository;
import fr.baziz.lightecom.dao.ProductRepository;
import fr.baziz.lightecom.entities.Category;
import fr.baziz.lightecom.entities.Product;
import net.bytebuddy.utility.RandomString;

@SpringBootApplication
public class LightEcomApplication implements CommandLineRunner{
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;


	public static void main(String[] args) {
		SpringApplication.run(LightEcomApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		categoryRepository.save(new Category(null,"Ordinateur",null,null,null));
		categoryRepository.save(new Category(null,"Imprimantes",null,null,null));
		categoryRepository.save(new Category(null,"Téléphonnes",null,null,null));
		categoryRepository.save(new Category(null,"ordinateur",null,null,null));
		Random rnd = new Random();
		categoryRepository.findAll().forEach(c-> {
			for(int i=0;i<10;i++){
				Product p = new Product();
				p.setName(RandomString.make(18));
				p.setCurrentprice(100+rnd.nextInt(10000));
				p.setAvalable(rnd.nextBoolean());
				p.setPromotion(rnd.nextBoolean());
				p.setCategory(c);
				p.setPhotoname("unknown.png");
				productRepository.save(p);

			}



		});

	}

}
