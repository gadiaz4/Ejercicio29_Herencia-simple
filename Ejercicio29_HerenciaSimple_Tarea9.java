/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio29_herenciasimple_tarea9;

/**
 *
 * @author Diaz Vera Gabriel Alexander
 */
class Accidente{
    String tipo;
    String lugar;
    int fecha;
    int hora;

    void MostrarAccidente(){
        System.out.println("El tipo de accidente es: "+tipo+"\n");
    }
}
//
class Accidente_Transito extends Accidente{
    String tipo;
    String tipot;
    String lugart;
    int fechat;
    double horat;
    void MostrarTipo(){
    System.out.println("El tipo de accidente es: "+tipot);
    System.out.println("El lugar de accidente es: "+lugart);
    System.out.println("La fecha del accidente es: "+fechat+" Julio 2013");
    System.out.println("La hora de accidente es: "+horat);
    }
}
class Accidente_Domestico extends Accidente{
    String tipo;
    String causa;
    String lugard;
    String tipo_danio;
    String riesgo;
    void MostrarTipo(){
    System.out.println("El accidente es causado por: "+causa);
    System.out.println("El lugar del accidente : "+lugard);
    System.out.println("El tipo de danio del accidente es: "+tipo_danio);
    System.out.println("El riesgo del accidente es: "+riesgo);
    }
}
public class Ejercicio29_HerenciaSimple_Tarea9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("\t\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE\n");
    System.out.println("Nombre: Díaz Vera Gabriel Alexander");
    System.out.println("Asignatura: Programación");
    System.out.println("Nrc: 7450");
    System.out.println("Tema: Simulacion del accionamiento de un airbag mediante "
            + "un indicador auditivo y visual (buzer, led), además le permita "
            + "determinar el tiempo en que se mantiene accionado\n");
    Accidente_Transito A_T=new Accidente_Transito();
    Accidente_Domestico A_D=new Accidente_Domestico();


    A_T.tipot="Choque frontal";
    A_T.lugart="kilometro 5 via Quito";
    A_T.fechat=5;
    A_T.horat=11.15;
    A_D.tipo="Accidente Domestico";
    A_D.causa="Intoxicacion";
    A_D.lugard="cocina";
    A_D.tipo_danio="danios intestinales";
    A_D.riesgo="perdida de vida";

        System.out.println("Los datos del accidente: ");
        A_T.MostrarTipo();
        System.out.println();

        System.out.println("Los datos del accidente: ");
        A_D.MostrarTipo();

    }

}
