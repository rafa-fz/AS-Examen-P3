package ec.edu.espe.producto.producto.controller.dto;

import java.math.BigDecimal;

public class ProductoDTO {
    private String codProducto;
    private String nombre;
    private BigDecimal existencia;
    private BigDecimal precio;

    public ProductoDTO() {

    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getExistencia() {
        return existencia;
    }

    public void setExistencia(BigDecimal existencia) {
        this.existencia = existencia;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codProducto == null) ? 0 : codProducto.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductoDTO other = (ProductoDTO) obj;
        if (codProducto == null) {
            if (other.codProducto != null)
                return false;
        } else if (!codProducto.equals(other.codProducto))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ProductoDTO [codProducto=" + codProducto + ", nombre=" + nombre + ", existencia=" + existencia
                + ", precio=" + precio + "]";
    }

}
