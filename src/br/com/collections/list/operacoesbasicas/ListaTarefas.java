package br.com.collections.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listTarefas;
    public ListaTarefas() {
        this.listTarefas = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao) {
        this.listTarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : listTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        listTarefas.removeAll(tarefasParaRemover);

    }
    public int obterNumeroTotalTarefas() {
        return listTarefas.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(listTarefas);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O número de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 4");
        System.out.println("O número de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());


        listaTarefas.removerTarefa("Tarefa 2");
        System.out.println("O número de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();


    }
}
