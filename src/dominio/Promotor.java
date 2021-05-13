package dominio;

public class Promotor extends Empleado{
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolante;
    private int salarioPromotor;

    public Promotor(String nombre, int volantesRepartidos, int valorVolante, int comprasVolante){
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante =comprasVolante;}

    @Override
    public long calcularSalario() {
        this.salarioPromotor = comprasVolante + volantesRepartidos;
        return salarioPromotor;
    }
}
