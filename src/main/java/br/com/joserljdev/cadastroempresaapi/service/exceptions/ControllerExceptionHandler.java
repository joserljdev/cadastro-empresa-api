package br.com.joserljdev.cadastroempresaapi.service.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.joserljdev.cadastroempresaapi.domain.DetalhesErro;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(EmpresaNaoEncontradaException.class)
	public ResponseEntity<DetalhesErro> handleEmpresaNaoEncontradaException(EmpresaNaoEncontradaException e, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404);
		erro.setMensagem("A empresa não pôde ser encontrada!");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
	@ExceptionHandler(RemoverEmpresaException.class)
	public ResponseEntity<DetalhesErro> handleRemoverEmpresaException(RemoverEmpresaException e, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404);
		erro.setMensagem("Matriz não pode ser removida!");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
}