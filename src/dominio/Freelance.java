package dominio;

public class Freelance extends Empleado {
    private long valorHora;
    private int horasTrabajadas;
    private long salarioFree;

    public Freelance(String nombre, int valorHora, int horasTrabajadas){
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public long calcularSalario() {
        this.salarioFree = valorHora + horasTrabajadas;
        return salarioFree;
    }
}
