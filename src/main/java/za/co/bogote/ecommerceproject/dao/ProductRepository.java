package za.co.bogote.ecommerceproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.bogote.ecommerceproject.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
