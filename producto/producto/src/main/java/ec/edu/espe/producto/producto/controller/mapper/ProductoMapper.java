package ec.edu.espe.producto.producto.controller.mapper;

import org.springframework.stereotype.Component;

import ec.edu.espe.producto.producto.controller.dto.ProductoDTO;
import ec.edu.espe.producto.producto.model.Producto;

@Component
public class ProductoMapper {
    public Producto toPersistance(ProductoDTO dto) {
        if (dto != null) {
            Producto producto = new Producto();
            producto.setCodProducto(dto.getCodProducto());
            producto.setNombre(dto.getNombre());
            producto.setExistencia(dto.getExistencia());
            producto.setPrecio(dto.getPrecio());

            return producto;
        }
    }

    public ProductoDTO toDto(Producto entity) {
        if (entity != null) {
            ProductoDTO dto = new ProductoDTO();
            dto.setCodProducto(entity.getCodProducto());
            dto.setNombre(entity.getNombre());
            dto.setExistencia(entity.getExistencia());
            dto.setPrecio(entity.getPrecio());

            return dto;
        }
    }

}
