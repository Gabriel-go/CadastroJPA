/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.CadatroDao;

import cadastro.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Gabriel-Notebook
 */
public class CadastroDao {

    public Cliente salvar(Cliente cliente) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CadastroPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {

            if (cliente.getId() == 0) { //se o id for vazio ele insere
                em.persist(cliente);
            } else {
                if (!em.contains(cliente)) {//Verifico se encontra o obj
                    if (em.find(Cliente.class, cliente.getId()) == null) { //tenta localizar o objeto
                        throw new Exception("Erro ao atualizar o regitro, verifique se exite!");
                    }
                }
                cliente = em.merge(cliente); // executa o update
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {

            em.close();
        }
        return cliente;
    }

    public void remover(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CadastroPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {

            Cliente cliente = em.find(Cliente.class, id); //criando e consultando o OBJ cliente
            em.remove(cliente); // removendo obj
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public Cliente consulta(int id) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CadastroPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Cliente cli = em.find(Cliente.class, id);//criando e consultando o OBJ cliente
        try {

            if (cli == null) {// Verificando se o cliente não esta vazio
                throw new Exception("Cliente não encontrado");
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            return cli;
        }
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
