package ec.edu.espe.facturacion.facturacion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.facturacion.facturacion.model.FacturaDetalle;

@Repository
public interface FacturaDetalleRespository extends MongoRepository<FacturaDetalle, Integer> {

}
