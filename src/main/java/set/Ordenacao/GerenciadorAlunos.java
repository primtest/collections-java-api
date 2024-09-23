package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributo
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(Long matricula, String nome, double media) {
        alunoSet.add(new Aluno(matricula, nome, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunosParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet){
                if (a.getMatricula() == matricula){
                    alunosParaRemover = a;
                    break;
                }
            } alunoSet.remove(alunosParaRemover);
        } else {
            System.out.println("Não foi encontrado um aluno com o numero de matricula: " + matricula + ".");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()) {
            return alunosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Aluno> exibirAlunoPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunoSet.isEmpty()) {
            alunosPorNota.addAll(alunoSet);
            return alunosPorNota;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void exibirAlunos() {
        if (!alunoSet.isEmpty()) {
            System.out.println(alunoSet);
        } else {
            System.out.println("Nenhum aluno ainda.");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.adicionarAluno(123456L,"João", 7.5);
        gerenciadorAlunos.adicionarAluno(123457L, "Maria", 9.0);
        gerenciadorAlunos.adicionarAluno(123458L, "Carlos", 5.0);
        gerenciadorAlunos.adicionarAluno(123459L,"Ana", 6.8);

        gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirAlunoPorNota());

        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
    }

}
