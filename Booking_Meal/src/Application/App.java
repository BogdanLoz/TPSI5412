package Application;

import java.util.ArrayList;
import model.Cliente;
import model.Restaurante;
import view.Menu;

public class App {
    
    static ArrayList<Restaurante> res = new ArrayList<Restaurante>();
    static ArrayList<Cliente> cli = new ArrayList<Cliente>();
    
    public static void main(String[] args) {
        new Menu(res,cli);
    }
    
}
