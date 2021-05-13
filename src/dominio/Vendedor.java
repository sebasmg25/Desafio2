package dominio;

public class Vendedor extends Directo{
    private long ventasDelMes;
    private int salarioVendedor = 0;


    public Vendedor(String nombre, int salario, int ventasDelMes){
        super(nombre,salario);
        this.ventasDelMes = ventasDelMes;
    }

    public long calcularComision (){
        long comision;
        if( salarioVendedor >= 1000000) {
            comision = (long) ((ventasDelMes * 4.5) / 100);
        } else{ comision = (ventasDelMes*5)/100;}

        return comision;
    }

    @Override
    public long calcularSalario() {
        this.salarioVendedor = (int) (salarioVendedor + calcularComision());
        return salarioVendedor;
    }

}

