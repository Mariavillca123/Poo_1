public class ProductoAlimento extends Productos {

    private String fechaCaducidad;
    private String fechaElaboracion;

    public ProductoAlimento(String nombre,
                            double precio,
                            int cantidad,
                            TipoProducto tipo,
                            String fechaCaducidad,
                            String fechaElaboracion){
        super (nombre, precio, cantidad, tipo);
        this.fechaCaducidad = fechaCaducidad;
        this.fechaElaboracion = fechaElaboracion;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("fechaCaducidad = " + fechaCaducidad);
        System.out.println("fechaElaboracion = " + fechaElaboracion);
    }
}
