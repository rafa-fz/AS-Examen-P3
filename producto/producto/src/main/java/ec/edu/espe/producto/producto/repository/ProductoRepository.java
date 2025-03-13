package ec.edu.espe.producto.producto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.producto.producto.model.Producto;

@Repository
public interface ProductoRepository extends MongoRepository<Producto, String> {

}
