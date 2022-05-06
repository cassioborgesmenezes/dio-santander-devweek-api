package com.dio.santander.bankline.api.model;

import java.math.BigDecimal;
import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A classe {@code Movimentacao} apresenta os dados de movimentacao bancaria.
 * <p>
 * 
 * @author cassiomenezes
 * @since 2022-05-03
 */
@Entity
@Table(name = "t_Movimentacao")
public class Movimentacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigDecimal					id;
	private Timestamp					dataHora;
	private String						descricao;
	private BigDecimal					valor;
	@Enumerated
	private MovimentacaoTipoEnum		tipo;
}
