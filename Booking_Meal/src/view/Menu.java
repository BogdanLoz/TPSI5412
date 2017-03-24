package view;

import controller.GestorClientes;
import controller.GestorRestaurantes;
import java.util.ArrayList;
import java.util.Scanner;
import model.Cliente;
import model.Restaurante;

public class Menu {
    
    public Menu(ArrayList<Restaurante>res,ArrayList<Cliente>cli){
        int option;
        
        System.out.println("1->Inserir Clientes");
        System.out.println("2->Listar Clientes");
        System.out.println("3->Inserir Restaurantes");
        System.out.println("4->Listar Restaurantes");
        option = new Scanner(System.in).nextInt();
        
        switch(option){
            case 1 : 
                new GestorClientes().RegistoClientes(cli);
                break;
            case 2 :
                new GestorClientes().ConsultaCliente(cli);
                break;
            case 3 :
                new GestorRestaurantes().RegistoRestaurantes(res);
                break;
            case 4 :
                new GestorRestaurantes().ConsultaRestaurantes(res);
                break;
        }
    }
}
