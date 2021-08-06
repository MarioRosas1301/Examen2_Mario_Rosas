
package test;

import dominio.Persona_Jubilada;
import java.util.Scanner;

public class testJubilacion {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Persona_Jubilada persona=null;
        String cedula,nombre;
        int anios_aporte,salario_base;
        char empresa;
        int op=0;
        System.out.println("-- IESS --");
        do{
            System.out.println("1. Jubilacion por Vejez");
            System.out.println("2. Jubilacion por Discapacidad");
            System.out.println("3. Jubilacion Patronal");
            System.out.println("4. Salir");
            System.out.println("Escoja el tipo de jubilacion");
            op=entrada.nextInt();
            switch(op){
                case 1:
                    System.out.println("Cedula: ");
                    cedula=entrada.next();
                    System.out.println("Nombre: ");
                    nombre=entrada.next();
                    System.out.println("Años de aporte: ");
                    anios_aporte=entrada.nextInt();
                    System.out.println("Salario: ");
                    salario_base=entrada.nextInt();
                    persona = new Persona_Jubilada(cedula, nombre, anios_aporte, salario_base);
                    break;
                case 2:
                    System.out.println("Cedula: ");
                    cedula=entrada.next();
                    System.out.println("Nombre: ");
                    nombre=entrada.next();
                    System.out.println("Años de aporte: ");
                    anios_aporte=entrada.nextInt();
                    System.out.println("Salario: ");
                    salario_base=entrada.nextInt();
                    persona = new Persona_Jubilada(cedula, nombre, anios_aporte, salario_base);
                    break;
                case 3:
                    System.out.println("Cedula: ");
                    cedula=entrada.next();
                    System.out.println("Nombre: ");
                    nombre=entrada.next();
                    System.out.println("Años de aporte: ");
                    anios_aporte=entrada.nextInt();
                    System.out.println("Salario: ");
                    salario_base=entrada.nextInt();
                    persona = new Persona_Jubilada(cedula, nombre, anios_aporte, salario_base);
                    System.out.println("Tipo de empresa");
                    System.out.println("Publica = u");
                    System.out.println("Privada: = v");
                    empresa=entrada.next().charAt(0);
                    if(empresa=='u'){
                        System.out.println("Recibe un aumento del 5%");
                    }else
                        System.out.println("Recibe un aumento del 10%"); 
                    break;
                case 4: 
                    System.out.println("-- Gracias por usar el porgrama --");
                    break;
            }
            
        }while(op!=4);
    }
    
}
