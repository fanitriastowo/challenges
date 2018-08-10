package co.id.softwareseni.hourstest.challanges.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.id.softwareseni.hourstest.challanges.model.Product;

@Repository
public interface ProductRepository
		extends JpaRepository<Product, Serializable> {

	List<Product> findAllByType(String type);

	List<Product> findAllByTransactionID(Long transaction_id);

}
