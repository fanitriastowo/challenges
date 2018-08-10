package co.id.softwareseni.hourstest.challanges.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.id.softwareseni.hourstest.challanges.model.Product;
import co.id.softwareseni.hourstest.challanges.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public void insert(Product product) {
		productRepository.save(product);
	}

	public List<Product> getAll() {
		return productRepository.findAll();
	}

	public Product put(Product product) {
		return productRepository.save(product);
	}

	public Product get(Long id) {
		return productRepository.findOne(id);
	}

	public List<Product> getAllTransactionsByType(String type) {
		return productRepository.findAllByType(type);
	}

	public List<Product> getAllByTransactionID(Long transaction_id) {
		return productRepository.findAllByTransactionID(transaction_id);
	}

	public Product putWithID(Long transaction_id, Product product) {
		Product newProduct = new Product();
		newProduct.setTransactionID(transaction_id);
		newProduct.setName(product.getName());
		newProduct.setType(product.getType());
		newProduct.setAmount(product.getAmount());
		return productRepository.save(newProduct);
	}
}
