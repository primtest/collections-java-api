package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    //criando um hashSet para uma AgendaContatos vazia
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //métodos

    //método_void(vazio) usando o .add para adicionar o Contato
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    //método_usando o.get para exibir o contatoSet
    public void exibirContatos() {
        if (!contatoSet.isEmpty()) {
            System.out.println(contatoSet);
        }else {
            System.out.println("O conjunto está vazio.");

        }
    }

    //método_para buscar e retornar um nome no set
    public Set<Contato> pesquisarPorNome(String nome) {
        //HashSet para armazenar o nome encontrado
        Set<Contato> contatoPorNome = new HashSet<>();
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().startsWith(nome)) {
                    contatoPorNome.add(c);
                }
            }
            return contatoPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio.");
        }
    }

        //método_ para atualizar o número de um contato
     public Contato atualizarNumeroContato(String nome, int novoNumero) {
        //variável nula: contatoAtualizado
        Contato contatoAtualizado = null;
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
        } else {
            throw new RuntimeException("O conjunto está vazio.");
        }
     }

    public static void main(String[] args) {
        // instanciando a agendaContatos a partir da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // exibindo contatos no conjunto ainda vazio
        agendaContatos.exibirContatos();

        // adicionando contatos à agenda
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

        // exibindo contatos agora com a lista adicionada
        agendaContatos.exibirContatos();

        // pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        // atualizando o número de um contato
        agendaContatos.atualizarNumeroContato("Carolina", 12345678);

        // exibindo contatos com a agenda atualizada
        System.out.println("Contatos da agenda após a atualização:");
        agendaContatos.exibirContatos();
    }

}
