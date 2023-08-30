/**
 * 
 */
package br.com.gomes.dao;

import java.util.List;

import br.com.gomes.domain.Curso;

/**
 * @author wendel.gomes
 *
 */
public interface ICursoDao {

	public Curso cadastrar(Curso curso);

	public void excluir(Curso cur);

	public List<Curso> buscarTodos();
}
