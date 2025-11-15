package org.mscv.cursos.services;

import java.util.List;
import java.util.Optional;

import org.mscv.cursos.models.Usuario;
import org.mscv.cursos.models.entity.Curso;

public interface CursoService {
	List<Curso> listar();
	Optional<Curso> porId(Long id);
	Curso guardar (Curso curso);
	void eliminar (Long id);
	
	Optional<Usuario> asignarUsuario(Usuario usuario, Long cursoId);
	Optional<Usuario> crearUsuario(Usuario usuario, Long cursoId);
	Optional<Usuario> eliminarUsuario(Usuario usuario, Long cursoId);
}
