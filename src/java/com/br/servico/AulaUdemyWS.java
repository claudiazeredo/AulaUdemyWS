/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.servico;

import com.br.dao.Dao;
import com.br.pojo.Aluno;
import com.br.pojo.Curso;
import java.util.List;
import java.util.Map;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Claudia
 */
@WebService(serviceName = "AulaUdemyWS")
@Stateless()
public class AulaUdemyWS {

    /**
     * This is a sample web service operation
     */
    
    @WebMethod(operationName = "obterAluno")
    public List<Aluno> obterAluno(@WebParam(name = "matricula_aluno") Long matricula) {
        Dao.inserirDados();
        return Dao.getAlunos(matricula);    
    }
    
    @WebMethod(operationName = "obterCurso")
    public List<Curso> obterCurso(@WebParam(name = "nome_curso") String nome) {
        Dao.inserirDados();
        return Dao.getCursos(nome);
        
    }
    
    
}
