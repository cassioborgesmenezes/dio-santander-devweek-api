package com.dio.santander.banklineapimodel;

import java.math.BigDecimal;
import java.security.Timestamp;

/**
 * A classe {@code Movimentacao} apresenta os dados de movimentacao bancaria.
 * <p>
 * 
 * @author cassiomenezes
 * @since 2022-05-03
 */
public class Movimentacao {
	private BigDecimal					id;
	private Timestamp					dataHora;
	private String						descricao;
	private BigDecimal					valor;
	private MovimentacaoTipoEnum		tipo;
}
