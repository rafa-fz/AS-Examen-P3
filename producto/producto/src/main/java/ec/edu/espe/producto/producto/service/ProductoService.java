package ec.edu.espe.producto.producto.service;

import org.springframework.stereotype.Service;

import ec.edu.espe.producto.producto.model.Producto;
import ec.edu.espe.producto.producto.repository.ProductoRepository;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public Producto buscarProducto(String codProducto) {
        return productoRepository.findById(codProducto);
    } 

}
