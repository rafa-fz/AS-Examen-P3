package ec.edu.espe.producto.producto.service;

import org.springframework.stereotype.Service;

import ec.edu.espe.producto.producto.controller.dto.ProductoDTO;
import ec.edu.espe.producto.producto.model.Producto;
import ec.edu.espe.producto.producto.repository.ProductoRepository;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public Producto buscarProducto(String codProducto) {
        return productoRepository.findById(codProducto);
    }
    
    public ProductoDTO crearProducto (ProductoDTO productoDTO){

        try

        Producto producto = new Producto();
        producto.setCodProducto(productoDTO.getCodProducto());
        producto.setNombre(productoDTO.getNombre());
        producto.setExistencia(productoDTO.getExistencia());
        producto.setPrecio(productoDTO.getPrecio());

        productoRepository.save(producto);


    }

}
