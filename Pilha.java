import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        //ArrayDeque<Usuario> pilha = new ArrayDeque<Usuario>();
        Deque<Usuario> pilha = new ArrayDeque<Usuario>();

        Usuario u1 = new Usuario("Usuario1");   
        Usuario u2 = new Usuario("Usuario2");   
        Usuario u3 = new Usuario("Usuario3");   
        Usuario u4 = new Usuario("Usuario4");   

        pilha.add(u1);
        pilha.add(u2);
        pilha.add(u3);
        pilha.add(u4);
        
        pilha.remove(u4);
        pilha.poll(); // Remove o primeiro
        pilha.pop(); // Remove o primeiro
        
        System.out.println(pilha.peek().getNome());
        System.out.println(pilha.element());

        System.out.println(pilha.isEmpty());
        System.out.println(pilha.size());
        System.out.println(pilha.contains(u1));
        
        for (Usuario usuario : pilha) {
            System.out.println(usuario.getNome());
        }
    }
}
