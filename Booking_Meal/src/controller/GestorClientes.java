package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Cliente;

public class GestorClientes {
   String nome,
          morada,
          email,
          telefone;
   int id;
   
  
   public void RegistoClientes(ArrayList<Cliente>cli){
       
       id = cli.size();
       System.out.println("Registo Clientes");
       System.out.print("Nome do Cliente : ");
       nome = new Scanner(System.in).nextLine();
       System.out.print("Morada do Cliente");
       morada = new Scanner(System.in).nextLine();
       System.out.print("Email do Cliente");
       email = new Scanner(System.in).nextLine();
       System.out.println("Telefone do Cliente");
       telefone = new Scanner(System.in).nextLine();
       Cliente cliente = new Cliente(nome , morada, telefone, email, id);
       cli.add(cliente);
   }
   
   public void ConsultaCliente(ArrayList<Cliente>cli){
        int id;
   
        System.out.println("Procura por ID");
        id = new Scanner(System.in).nextInt();
        
           for(int i = 0;i<cli.size();i++){
              if(id == cli.get(i).getId()){
                System.out.println("Nome : "+cli.get(i).getNome());
                System.out.println("Morada : "+cli.get(i).getMorada());
                System.out.println("Telefone : "+cli.get(i).getTelefone());
                System.out.println("Email : "+cli.get(i).getEmail());
              }
           }
   }
}
