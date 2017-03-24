package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Restaurante;

public class GestorRestaurantes {
    String nome,
           morada,
           contacto,
           especialidade;
    int id;
    
    public void RegistoRestaurantes(ArrayList<Restaurante>res){
        id = res.size();
        System.out.println("Registar Restaurantes");
        System.out.print("Nome do Restaurante : ");
        nome = new Scanner(System.in).nextLine();
        System.out.print("Morada do Restaurante : ");
        morada = new Scanner(System.in).nextLine();
        System.out.print("Contacto do Restaurante : ");
        contacto = new Scanner(System.in).nextLine();
        System.out.println("Especialidade do Restaurante");
        especialidade = new Scanner(System.in).nextLine();
        
       Restaurante restaurante = new Restaurante(nome , morada, contacto, especialidade, id);
       res.add(restaurante);
    }
    
    public void ConsultaRestaurantes(ArrayList<Restaurante>res){
        for(int i = 0;i<res.size();i++){
             
            System.out.println("Nome do Restaurante : " + res.get(i).getNome());
            System.out.println("Morada do Restaurante : " + res.get(i).getMorada());
            System.out.println("Contacto do Restaurante : " + res.get(i).getContacto());
            System.out.println("Especialidade : " + res.get(i).getEspecialidade());
              
        }
    }
}
