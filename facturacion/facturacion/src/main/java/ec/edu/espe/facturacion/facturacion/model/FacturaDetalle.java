package ec.edu.espe.facturacion.facturacion.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "facturaDetalles")
public class FacturaDetalle {

    @Id
    private Integer codDetalle;
    private Integer codFactura;
    private String codProducto;
    private BigDecimal cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal subtotal;
    private BigDecimal iva;
    private BigDecimal total;

    public FacturaDetalle() {

    }

    public Integer getCodDetalle() {
        return codDetalle;
    }

    public void setCodDetalle(Integer codDetalle) {
        this.codDetalle = codDetalle;
    }

    public Integer getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(Integer codFactura) {
        this.codFactura = codFactura;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codDetalle == null) ? 0 : codDetalle.hashCode());
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
        FacturaDetalle other = (FacturaDetalle) obj;
        if (codDetalle == null) {
            if (other.codDetalle != null)
                return false;
        } else if (!codDetalle.equals(other.codDetalle))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "FacturaDetalle [codDetalle=" + codDetalle + ", codFactura=" + codFactura + ", codProducto="
                + codProducto + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", subtotal="
                + subtotal + ", iva=" + iva + ", total=" + total + "]";
    }

}
