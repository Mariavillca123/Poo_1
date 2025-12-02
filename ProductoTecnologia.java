public class ProductoTecnologia extends Productos implements DescuentoAplicable{
    private int garantiaMeses;

    public ProductoTecnologia(String nombre,
                              double precio,
                              int cantidad,
                              TipoProducto tipo,
                              int garantiaMeses){
        super(nombre, precio, cantidad, tipo);
        this.garantiaMeses = garantiaMeses;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("garantiaMeses = " + garantiaMeses);;
    }

    public double aplicarDescuento(double porcentaje){
        return getPrecio() - (getPrecio() * porcentaje);
    }
}
