package com.dio.santander.banklineapimodel;

import java.math.BigDecimal;

/**
 * A classe {@code Correntista} apresenta os dados de um correntista.
 * <p>
 * 
 * @author cassiomenezes
 * @since 2022-05-03
 */
public class Correntista {
	private BigDecimal					id;
	private String						cpf;
	private String						nome;
	private Conta						conta;
}
