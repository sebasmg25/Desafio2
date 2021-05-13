package aplicacion;

import dominio.*;

import java.util.ArrayList;

public class app {

    public static void main (String [] args) {
        /*
         * Para definir un objeto ( o crear objeto) instancia
         *
         * Tipo nombre = new Tipo(); => si el construsctor tiene parametros van dentro de los parentesis (/aqui/);
         * */
        Vendedor vend1 = new Vendedor("Julian", 2450000, 55510000);
        Vendedor vend2 = new Vendedor("Carolina", 990000, 62487000);
        Directo direc1 = new Directo("David", 2895000);
        Directo direc2 = new Directo("Juan", 5360000);
        Freelance Free1 = new Freelance("Johanna", 76000,85);
        Freelance Free2 = new Freelance("Gustavo", 52500,60);
        Promotor Prom1 = new Promotor("Pedro",1500,250,48);

        ArrayList<Empleado> ListaEmpleados = new ArrayList<Empleado>();
        ListaEmpleados.add(vend1);
        ListaEmpleados.add(vend2);
        ListaEmpleados.add(direc1);
        ListaEmpleados.add(direc2);
        ListaEmpleados.add(Free1);
        ListaEmpleados.add(Free2);
        ListaEmpleados.add(Prom1);

        Nomina nomina = new Nomina(ListaEmpleados);
        nomina.calcularNomina();
        nomina.listarDirectos();
        nomina.listarFreelancers();
        nomina.listarPromotores();

    }
}
