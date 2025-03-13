package ec.edu.espe.producto.producto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.producto.producto.model.Producto;
import ec.edu.espe.producto.producto.service.ProductoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/{CodProducto}")
    public ResponseEntity <Producto> obtenerProducto (@PathVariable("codProducto") String codProducto){
        return ResponseEntity.ok(productoService.buscarProducto(codProducto));
    }

    @PostMapping
    public ResponseEntity <Producto> crearProducto (@RequestBody ){
        return ResponseEntity.ok(productoService.crearProducto());
    }


}
