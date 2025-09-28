/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.projetointegrador;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class menu {

    public static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public void iniciar() {
        Scanner entrada = new Scanner(System.in);
        apresentacao pf = new apresentacao();
        String[] novosIntegrantes = new String[5];
        integranteList li = new integranteList();
        ODSList listaODS = new ODSList();

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("====================== ATV 01 ======================");
            System.out.println("====================================================");
            System.out.println("========= Informações do PI =========");
            System.out.println("====================================================");
            System.out.println("================= 1 - Apresentacao do Projeto =================");
            System.out.println("================= 2 - ODS =================");
            System.out.println("================= 3 - Equipe =================");
            System.out.println("=================     4 - SAIR     =================");
            System.out.println("====================================================");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    limparTela();
                    if (pf.getNomeProjeto() == null) {
                        System.out.println("Digite o nome do Projeto Integrador: ");
                        String novoNome = entrada.nextLine();
                        pf.setNomeProjeto(novoNome);
                        System.out.println("Digite a descricao do Projeto Integrador: ");
                        String novaDescricao = entrada.nextLine();
                        pf.setDescricaoProjeto(novaDescricao);
                        limparTela();
                    } else {

                        System.out.println("================= Nome do Projeto =================");
                        System.out.println(pf.getNomeProjeto());
                        System.out.println("================= Descricao do Projeto ");
                        System.out.println(pf.getDescricaoProjeto());
                        System.out.println("Pressione ENTER para Continuar...");
                        entrada.nextLine();
                        limparTela();
                    }
                    break;
                case 2:
                    limparTela();

                    if (listaODS.vazio()) {
                        System.out.println("Nenhuma ODS foi cadastrada ainda. Vamos começar.");
                        System.out.println("Quantas ODS este projeto aborda?");
                        int qtd = entrada.nextInt();
                        entrada.nextLine();

                        for (int i = 0; i < qtd; i++) {
                            System.out.println("\n--- Cadastrando ODS " + (i + 1) + " ---");
                            System.out.println("Digite o nome da ODS (ex: ODS 1: Erradicação da Pobreza):");
                            String nome = entrada.nextLine();

                            System.out.println("Digite uma breve descrição para esta ODS:");
                            String descricao = entrada.nextLine();

                            ODS nova = new ODS(nome, descricao);

                            listaODS.adicionarODS(nova);
                        }
                        System.out.println("\nODS cadastradas com sucesso!");
                        System.out.println("Pressione ENTER para Continuar...");
                        entrada.nextLine();
                        limparTela();

                    } else {
                        System.out.println("================= ODS Cadastradas no Projeto =================");

                        for (ODS ods : listaODS.getODS()) {

                            System.out.println("\nNome: " + ods.getNomeOds());
                            System.out.println("Descrição: " + ods.getDescricaoOds());
                            System.out.println("-------------------------------------------------");
                        }

                        System.out.println("\nPressione ENTER para Continuar...");
                        entrada.nextLine();
                        limparTela();
                    }
                    break;
                case 3:
                    limparTela();

                    if (li.vazio() == true) {
                        System.out.println("A lista de integrantes está vazia. Vamos cadastrar.");
                        System.out.println("Quantos integrantes fazem parte deste projeto Integrador?");
                        int qtd = entrada.nextInt();
                        entrada.nextLine();

                        for (int i = 0; i < qtd; i++) {
                            System.out.println("Digite o nome do integrante " + (i + 1) + ":");
                            String nome = entrada.nextLine();

                            System.out.println("Digite o email Institucional do integrante " + (i + 1) + ":");
                            String email = entrada.nextLine();

                            integrante novo = new integrante(nome, email);

                            li.adicionarIntegrante(novo);
                        }
                        System.out.println("Integrantes cadastrados com sucesso!");
                        System.out.println("Pressione ENTER para Continuar...");
                        entrada.nextLine();
                        limparTela();

                    } else {
                        System.out.println("================= Integrantes Cadastrados =================");

                        for (integrante integ : li.getIntegrantes()) {

                            System.out.println("Nome: " + integ.getNomeIntegrante() + " | Email: " + integ.getEmailInstitucional());
                        }

                        System.out.println("==========================================================");
                        System.out.println("Pressione ENTER para Continuar...");
                        entrada.nextLine();
                        limparTela();
                    }

                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERRO! Opção Inválida");
            }
        }
    }
}
