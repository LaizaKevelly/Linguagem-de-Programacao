import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lista { //List
    public static void main(String[] args) throws Exception {
        //ArrayList<Usuario> lista = new ArrayList<Usuario>();
        List<Usuario> lista = new ArrayList<Usuario>();
        //List<Usuario> lista = new LinkedList<>();
        //List<Usuario> lista = new Vector<>();

        Usuario u1 = new Usuario("Usuario1");   
        Usuario u2 = new Usuario("Usuario2");   
        Usuario u3 = new Usuario("Usuario3");   
        Usuario u4 = new Usuario("Usuario4");   

        lista.add(u1);
        lista.add(u2);
        lista.add(u3);
        lista.add(u4);

        lista.remove(u4);
        lista.add(3, u2);

        System.out.println(lista.get(1).getNome());

        System.out.println(lista.isEmpty());
        System.out.println(lista.size());
        System.out.println(lista.contains(u1));
        
        for (Usuario usuario : lista) {
            System.out.println(usuario.getNome());
        }
    }
}
