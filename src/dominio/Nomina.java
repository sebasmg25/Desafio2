package dominio;

import java.util.ArrayList;

public class Nomina {
    private ArrayList<Empleado> empleados;

    public Nomina (ArrayList<Empleado> empleados){
        this.empleados = empleados;
    }

    public void calcularNomina (){
        long sumatoria = 0;
        for(int i = 0 ; i < empleados.size(); i++){
            sumatoria = sumatoria + empleados.get(i).calcularSalario();
        }
    }

    public void listarDirectos () {
        ArrayList<Directo> directos = new ArrayList<Directo>();
        for(int i = 0 ; i < empleados.size(); i++){
            if(empleados.get(i).getClass().getName().equals("dominio.Directo") || empleados.get(i).getClass().getName().equals("dominio.Vendedor")){
                directos.add((Directo) empleados.get(i));
            }
        }
    }
    public void listarFreelancers () {
        ArrayList<Freelance> freelances = new ArrayList<Freelance>();
        for(int i = 0 ; i < empleados.size(); i++){
            if(empleados.get(i).getClass().getName().equals("dominio.Freelance")){
                freelances.add((Freelance) empleados.get(i));
            }
        }
    }
    public void listarPromotores () {
        ArrayList<Promotor> promotores = new ArrayList<Promotor>();
        for(int i = 0 ; i < empleados.size(); i++){
            if(empleados.get(i).getClass().getName().equals("dominio.Promotor")){
                promotores.add((Promotor) empleados.get(i));
            }
        }
    }




}
