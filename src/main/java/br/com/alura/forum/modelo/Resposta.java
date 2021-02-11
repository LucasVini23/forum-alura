package br.com.alura.forum.modelo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Resposta {

	private Long id;
	private String mensagem;
	private Topico topico;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	private Usuario autor;
	private Boolean solucao = false;

}
