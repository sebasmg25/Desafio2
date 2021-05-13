package dominio;

public class Directo extends Empleado {
    private long salarioDirecto;
    private long aporteSalud;
    private long aportePension;

    public Directo(String nombre, int salario){
        super(nombre);
        this.salarioDirecto = salario;
    }


    public long calcularSalario() {
        aporteSalud = this.salarioDirecto * 7 / 100;
        aportePension = (long) (this.salarioDirecto * 6.5 / 100);
        return salarioDirecto = salarioDirecto - aporteSalud - aportePension;

    }


}
