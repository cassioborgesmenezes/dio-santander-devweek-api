package com.dio.santander.bankline.api.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A classe {@code Correntista} apresenta os dados de um correntista.
 * <p>
 * 
 * @author cassiomenezes
 * @since 2022-05-03
 */
@Entity
@Table(name = "t_Correntista")
public class Correntista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigDecimal					id;
	@Column(length = 11)
	private String						cpf;
	@Column(length = 100)
	private String						nome;

	@Embedded
	private Conta						conta;
}
