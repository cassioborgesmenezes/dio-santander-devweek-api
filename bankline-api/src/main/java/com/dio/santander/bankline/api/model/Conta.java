package com.dio.santander.bankline.api.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * A classe {@code Conta} apresenta os dados de uma conta corrente.
 * <p>
 * 
 * @author cassiomenezes
 * @since 2022-05-03
 */
@Embeddable
public class Conta {
	@Column(name = "conta_numero")
	private BigDecimal					numero;
	@Column(name = "conta_saldo")
	private BigDecimal					saldo;
}
