package com.algaworks.algalog.domain.model.input;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaInput {

	@NotNull
	private ClienteIdInput cliente;
	
	@NotNull
	private DestinatarioInput destinatario;
	
	private BigDecimal taxa;
	
}
