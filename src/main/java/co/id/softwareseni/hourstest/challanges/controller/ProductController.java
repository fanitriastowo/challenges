package co.id.softwareseni.hourstest.challanges.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.id.softwareseni.hourstest.challanges.model.Product;
import co.id.softwareseni.hourstest.challanges.service.ProductService;

@RestController
@RequestMapping("/transaction_service")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/transaction")
	public List<Product> getAllTransaction() {
		return productService.getAll();
	}

	@GetMapping("/transaction/{id}")
	public Product getSingleTransaction(@PathVariable Long id) {
		return productService.get(id);
	}
	
	@PutMapping("/transaction")
	public Product putProduct(@RequestBody Product product) {
		return productService.put(product);
	}
	
	@PutMapping("/transaction/{transaction_id}")
	public Product putProductWithID(
			@PathVariable Long transaction_id,
			@RequestBody Product product) {
		return productService.putWithID(transaction_id, product);
	}

	@GetMapping("/type/{type}")
	public String[] getAllTransactionsByType(@PathVariable String type) {
		List<Product> list = productService.getAllTransactionsByType(type);

		String[] result = new String[list.size()];
		int index = 0;
		for (Product product : list) {
			System.out.println(product.getTransactionID());
			result[index] = product.getTransactionID().toString();
			index++;
		}
		return result;
	}

	@GetMapping("/sum/{transaction_id}")
	public Double getSumByTransactionID(@PathVariable Long transaction_id) {
		List<Product> list = productService.getAllByTransactionID(transaction_id);
		Double sum = 0.0;
		for (Product product : list) {
			sum = sum + product.getAmount();
		}
		return sum;
	}

}
