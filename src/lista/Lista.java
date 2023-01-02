package lista;

public class Lista {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        //método de visualização dos dados
        lista.adiciona("Lucas");     
        lista.adiciona("Lauan");
        lista.adiciona("Luan");
        lista.adiciona("Ivan");
        
        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());   
        System.out.println("Inicio da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento()); 
        
        lista.remover("Lucas");     
        lista.remover("Lauan");
        lista.remover("Luan");
        lista.remover("Ivan");
        
        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());   
        System.out.println("Inicio da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
    }
}
