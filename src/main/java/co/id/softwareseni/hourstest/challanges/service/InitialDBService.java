package co.id.softwareseni.hourstest.challanges.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.id.softwareseni.hourstest.challanges.model.Product;

@Transactional
@Service
public class InitialDBService {

	@Autowired
	private ProductService productService;
	
	@PostConstruct
	public void initial() {
		
		// insert initial data
		Product productA = new Product();
		productA.setTransactionID(1L);
		productA.setName("Toyota Sprinter Trueno AE86");
		productA.setType("Car");
		productA.setAmount(100_000d);
		
		Product productB = new Product();
		productB.setTransactionID(1L);
		productB.setName("Mazda RX7");
		productB.setType("Car");
		productB.setAmount(300_000d);
		
		Product productC = new Product();
		productC.setTransactionID(2L);
		productC.setName("Honda S2000");
		productC.setType("Car");
		productC.setAmount(500_000d);
		
		Product productD = new Product();
		productD.setTransactionID(2L);
		productD.setName("Koenigsegg One:1");
		productD.setType("Car");
		productD.setAmount(1_000_000d);
		
		productService.insert(productA);
		productService.insert(productB);
		productService.insert(productC);
		productService.insert(productD);
		
	}
}
