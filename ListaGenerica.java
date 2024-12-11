import java.util.ArrayList;
import java.util.List;

public class ListaGenerica <T>{ //--------- <T>
    public static void main(String[] args) {
        List<Object> lista = new ArrayList<Object>();
        //List<Usuario> lista = new LinkedList<>();
        //List<Usuario> lista = new Vector<>();

        UsuarioGenerico<Object> u1 = new UsuarioGenerico("Usuario1");   
        UsuarioGenerico<Object> u2 = new UsuarioGenerico("Usuario2");   
        UsuarioGenerico<Object> u3 = new UsuarioGenerico("Usuario3");   
        UsuarioGenerico<Object> u4 = new UsuarioGenerico("Usuario4");   

        lista.add(u1);
        lista.add(u2);
        lista.add(u3);
        lista.add(u4);

        lista.remove(u4);
        lista.add(3, u2);

        System.out.println(((UsuarioGenerico<Object>) lista.get(1)).getNome());

        System.out.println(lista.isEmpty());
        System.out.println(lista.size());
        System.out.println(lista.contains(u1));
        
        for (Object usuario : lista) {
            System.out.println(((UsuarioGenerico<Object>) usuario).getNome());
        }
    }
}
