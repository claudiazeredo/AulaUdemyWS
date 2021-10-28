/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.dao;

import com.br.pojo.Aluno;
import com.br.pojo.Curso;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Claudia
 */
public class Dao {
    public static final List<Aluno> LISTA_ALUNOS = new ArrayList<>();
    public static final List<Curso> LISTA_CURSOS = new ArrayList<>();
    
    public static void  inserirDados(){
        Aluno aluno = new Aluno();
        aluno.setMatricula(1111);
        aluno.setNome("Gustavo de Azeredo Jaú");
        aluno.setIdade(36);
        aluno.setTelefone("+553199998888");
        aluno.setEndereco("Rua das Couves, 766, Bairro Jardim, BH, MG, BR");
        LISTA_ALUNOS.add(aluno);
        
        Curso curso = new Curso();
        curso.setNomeCurso("WS Java");
        curso.setCargaHoraria(162);
        curso.setProfessor("Raphael Jeunon");
        curso.setAluno(aluno);
        LISTA_CURSOS.add(curso);
        
        Aluno aluno2 = new Aluno();
        aluno2.setMatricula(1112);
        aluno2.setNome("Lara de Azeredo Jaú");
        aluno2.setIdade(33);
        aluno2.setTelefone("+5531999362888");
        aluno2.setEndereco("Rua das Couves, 766, Bairro Jardim, BH, MG, BR");
        LISTA_ALUNOS.add(aluno2);
        
        Curso curso2 = new Curso();
        curso2.setNomeCurso("WS Abap");
        curso2.setCargaHoraria(162);
        curso2.setProfessor("Letícia Spindola");
        curso2.setAluno(aluno2);
        LISTA_CURSOS.add(curso2);
        
         Aluno aluno3 = new Aluno();
        aluno3.setMatricula(1113);
        aluno3.setNome("Willian de Azeredo Jaú");
        aluno3.setIdade(30);
        aluno3.setTelefone("+5531993458888");
        aluno3.setEndereco("Rua das Couves, 766, Bairro Jardim, BH, MG, BR");
        LISTA_ALUNOS.add(aluno3);
        
        Curso curso3 = new Curso();
        curso3.setNomeCurso("WS Java");
        curso3.setCargaHoraria(162);
        curso3.setProfessor("Raphael Jeunon");
        curso3.setAluno(aluno3);
        LISTA_CURSOS.add(curso3);
    }
    
    public static List<Aluno> getAlunos(long matricula){
        
        if(matricula == 0){
            return LISTA_ALUNOS;
        }else{
            List<Aluno> retorno = new ArrayList<>();
            
            for(Aluno aluno : LISTA_ALUNOS){
                if (aluno.getMatricula() == matricula){
                    retorno.add(aluno);
                    break;
                }
            }
            return retorno;
        }
    }
    
    public static List<Curso> getCursos(String nome){
        
        if(nome == null || nome.isEmpty()){
            return LISTA_CURSOS;
        }else{
            List<Curso> retorno = new ArrayList<>();
            
            for(Curso curso : LISTA_CURSOS){
                if (curso.getNomeCurso().equals(nome)){
                    retorno.add(curso);
                    break;
                }
            }
            
            return retorno;
        }
    }
    
    public static void main (String[] args){
        Dao.inserirDados();
        
        List<Aluno> listaAluno = Dao.getAlunos(1111);
        
        for(Aluno aluno : listaAluno){
            System.out.println(aluno.getNome());
        }
        
        System.out.println("\n----------------------------------------------------\n");
        
        List<Curso> listaCurso = Dao.getCursos("");
        
        for(Curso curso : listaCurso){
            System.out.println(curso.getNomeCurso() + " - " + curso.getAluno().getNome());
        }
        
    }
  
}
